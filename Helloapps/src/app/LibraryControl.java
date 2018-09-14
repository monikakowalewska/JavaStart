package app;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import data.Book;
import data.Library;
import data.Magazine;
import utils.DataReader;
import utils.FileManager;
import utils.LibraryUtils;

public class LibraryControl {

	// zmienna do komunikacji z u�ytkownikiem
	private DataReader dataReader;
	private FileManager fileManager;


	// "biblioteka" przechowuj�ca dane
	private Library library;

	public LibraryControl() {
		dataReader = new DataReader();
		fileManager = new FileManager();
        try {
			library = fileManager.readLibraryFromFile();
			System.out.println("Wczytano dane biblioteki z pliku ");
		} catch (ClassNotFoundException | IOException e) {
			library = new Library();
			System.out.println("Utworzono now� baz� biblioteki.");
		}

	}

	/*
	 * G��wna p�tla programu, kt�ra pozwala na wyb�r opcji i interakcj�
	 */
	public void controlLoop() {
		Option option = null;
        while (option != Option.EXIT) {
            try {
            	printOptions();
		option=Option.createFromInt(dataReader.getInt());
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
			case EXIT:
                 exit();

        		;
			}
			}
		catch (InputMismatchException e) {
            System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
        } catch (NumberFormatException | NoSuchElementException e) {
            System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
        }
    }

		// zamykamy strumie� wej�cia
		dataReader.close();
	}

	private void printOptions() {
		System.out.println("Wybierz opcj�: ");
		for(Option o: Option.values()) {
			System.out.println(o);
		}
	}

	private void addBook() {
		Book book = dataReader.readAndCreateBook();
		library.addBook(book);
	}

	private void printBooks() {
		LibraryUtils.printBooks(library);
	}

	private void addMagazine() {
		Magazine magazine = dataReader.readAndCreateMagazine();
		library.addMagazine(magazine);
	}

	private void printMagazines() {
		LibraryUtils.printMagazines(library);
	}
	private void exit() {
    	fileManager.writeLibraryToFile(library);
    }

	//klasa wewn�trzna 
	private enum Option {
        EXIT(0, "Wyj�cie z programu"),
        ADD_BOOK(1, "Dodanie ksi��ki"),
        ADD_MAGAZINE(2,"Dodanie magazynu/gazety"),
        PRINT_BOOKS(3, "Wy�wietlenie dost�pnych ksi��ek"),
        PRINT_MAGAZINES(4, "Wy�wietlenie dost�pnych magazyn�w/gazet");
     
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
        /*Metoda createFromInt() pozwala przekszta�ci� warto�� typu int na odpowiedni� warto�� typu Option. 
    	 * Wykorzystujemy tutaj metod� values(), kt�ra zwraca tablic� wszystkich warto�ci, 
    	 * a poniewa� kolejne elementy numerujemy od 0, to zwracamy po prostu odpowiedni element tej tablicy.*/
        public static Option createFromInt(int option) throws NoSuchElementException {
            Option result = null;
            try {
                result = Option.values()[option];
            } catch(ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException("Brak elementu o wskazanym ID");
            }
             
            return result;
        }
    }
}

