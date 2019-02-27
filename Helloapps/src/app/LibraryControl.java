package app;


import java.util.Comparator;
import java.util.InputMismatchException;

import data.Book;
import data.Library;
import data.LibraryUser;
import data.Magazine;
import data.Publication;
import data.User;
import exception.DataExportException;
import exception.DataImportException;
import exception.InvalidDataException;
import exception.NoSuchOptionException;
import exception.UserAlreadyExistsException;
import utils.ConsolePrinter;
import utils.DataReader;
import utils.FileManager;
import utils.FileManagerBuilder;


class LibraryControl {

	private ConsolePrinter printer = new ConsolePrinter();

    private DataReader dataReader = new DataReader(printer);

    private FileManager fileManager;



    private Library library;



    LibraryControl() {

        fileManager = new FileManagerBuilder(printer, dataReader).build();

        try {

            library = fileManager.importData();

            printer.printLine("Zaimportowane dane z pliku");

        } catch (DataImportException | InvalidDataException e) {

            printer.printLine(e.getMessage());

            printer.printLine("Zainicjowano now� baz�.");

            library = new Library();

        }

    }



    void controlLoop() {

        Option option;



        do {

            printOptions();

            option = getOption();

            switch (option) {

                case ADD_BOOK:

                    addBook();

                    break;

                case ADD_MAGAZINE:

                    addMagazine();

                    break;

                case PRINT_BOOKS:

                    printBooks();

                    break;

                case PRINT_MAGAZINES:

                    printMagazines();

                    break;

                case DELETE_BOOK:

                    deleteBook();

                    break;

                case DELETE_MAGAZINE:

                    deleteMagazine();

                    break;

                case ADD_USER:

                    addUser();

                    break;

                case PRINT_USERS:

                    printUsers();

                    break;

                case FIND_BOOK:

                    findBook();

                    break;

                case EXIT:

                    exit();

                    break;

                default:

                    printer.printLine("Nie ma takiej opcji, wprowad� ponownie: ");

            }

        } while (option != Option.EXIT);

    }



    private Option getOption() {

        boolean optionOk = false;

        Option option = null;

        while (!optionOk) {

            try {

                option = Option.createFromInt(dataReader.getInt());

                optionOk = true;

            } catch (NoSuchOptionException e) {

                printer.printLine(e.getMessage() + ", podaj ponownie:");

            } catch (InputMismatchException ignored) {

                printer.printLine("Wprowadzono warto��, kt�ra nie jest liczb�, podaj ponownie:");

            }

        }



        return option;

    }



    private void printOptions() {

        printer.printLine("Wybierz opcj�: ");

        for (Option option : Option.values()) {

            printer.printLine(option.toString());

        }

    }



    private void addBook() {

        try {

            Book book = dataReader.readAndCreateBook();

            library.addPublication(book);

        } catch (InputMismatchException e) {

            printer.printLine("Nie uda�o si� utworzy� ksi��ki, niepoprawne dane");

        } catch (ArrayIndexOutOfBoundsException e) {

            printer.printLine("Osi�gni�to limit pojemno�ci, nie mo�na doda� kolejnej ksi��ki");

        }

    }



    private void addMagazine() {

        try {

            Magazine magazine = dataReader.readAndCreateMagazine();

            library.addPublication(magazine);

        } catch (InputMismatchException e) {

            printer.printLine("Nie uda�o si� utworzy� magazynu, niepoprawne dane");

        } catch (ArrayIndexOutOfBoundsException e) {

            printer.printLine("Osi�gni�to limit pojemno�ci, nie mo�na doda� kolejnego magazynu");

        }

    }



    private void addUser() {

        LibraryUser libraryUser = dataReader.createLibraryUser();

        try {

            library.addUser(libraryUser);

        } catch (UserAlreadyExistsException e) {

            printer.printLine(e.getMessage());

        }

    }



    private void printBooks() {

        printer.printBooks(library.getSortedPublications(

                Comparator.comparing(Publication::getTitle, String.CASE_INSENSITIVE_ORDER))

        );

    }



    private void printMagazines() {

        printer.printMagazines(library.getSortedPublications(

              Comparator.comparing(Publication::getTitle, String.CASE_INSENSITIVE_ORDER)

        ));

    }



    private void printUsers() {

        printer.printUsers(library.getSortedUsers(

                Comparator.comparing(User::getLastName, String.CASE_INSENSITIVE_ORDER)

        ));

    }



    private void findBook() {

        printer.printLine("Podaj tytu� publikacji:");

        String title = dataReader.getString();

        String notFoundMessage = "Brak publikacji o takim tytule";

        library.findPublicationByTitle(title)

                .map(Publication::toString)

                .ifPresentOrElse(System.out::println, () -> System.out.println(notFoundMessage));

    }



    private void deleteMagazine() {

        try {

            Magazine magazine = dataReader.readAndCreateMagazine();

            if (library.removePublication(magazine))

                printer.printLine("Usuni�to magazyn.");

            else

                printer.printLine("Brak wskazanego magazynu.");

        } catch (InputMismatchException e) {

            printer.printLine("Nie uda�o si� utworzy� magazynu, niepoprawne dane");

        }

    }



    private void deleteBook() {

        try {

            Book book = dataReader.readAndCreateBook();

            if (library.removePublication(book))

                printer.printLine("Usuni�to ksi��k�.");

            else

                printer.printLine("Brak wskazanej ksi��ki.");

        } catch (InputMismatchException e) {

            printer.printLine("Nie uda�o si� utworzy� ksi��ki, niepoprawne dane");

        }

    }



    private void exit() {

        try {

            fileManager.exportData(library);

            printer.printLine("Export danych do pliku zako�czony powodzeniem");

        } catch (DataExportException e) {

            printer.printLine(e.getMessage());

        }

        dataReader.close();

        printer.printLine("Koniec programu, papa!");

    }



    private enum Option {

        EXIT(0, "Wyj�cie z programu"),

        ADD_BOOK(1, "Dodanie ksi��ki"),

        ADD_MAGAZINE(2, "Dodanie magazynu/gazety"),

        PRINT_BOOKS(3, "Wy�wietlenie dost�pnych ksi��ek"),

        PRINT_MAGAZINES(4, "Wy�wietlenie dost�pnych magazyn�w/gazet"),

        DELETE_BOOK(5, "Usu� ksi��k�"),

        DELETE_MAGAZINE(6, "Usu� magazyn"),

        ADD_USER(7, "Dodaj czytelnika"),

        PRINT_USERS(8, "Wy�wietl czytelnik�w"),

        FIND_BOOK(9, "Wyszukaj ksi��k�");



        private int value;

        private String description;



        Option(int value, String desc) {

            this.value = value;

            this.description = desc;

        }



        @Override

        public String toString() {

            return value + " - " + description;

        }



        static Option createFromInt(int option) throws NoSuchOptionException {

            try {

                return Option.values()[option];

            } catch (ArrayIndexOutOfBoundsException e) {

                throw new NoSuchOptionException("Brak opcji o id " + option);

            }

        }

    }
}

