package utils;

import java.util.Scanner;

import data.Book;
import data.LibraryUser;
import data.Magazine;

public class DataReader {
private Scanner sc;
	
	public DataReader() {
		private Scanner sc = new Scanner(System.in);
		private ConsolePrinter printer;
	}
	public DataReader(ConsolePrinter printer) {

        this.printer = printer;

    }
	public void close() {
		sc.close();
	}
	public int getInt(){
		try {

            return sc.nextInt();

        } finally {

            sc.nextLine();

        }
	}
	 public String getString() {

	        return sc.nextLine();

	    }

	public Book readAndCreateBook(){
		 printer.printLine("Tytu³: ");
	        String title = sc.nextLine();
	        printer.printLine("Autor: ");
	        String author = sc.nextLine();
	        printer.printLine("Wydawnictwo: ");
	        String publisher = sc.nextLine();
	        printer.printLine("ISBN: ");
	        String isbn = sc.nextLine();
	        printer.printLine("Rok wydania: ");
	        int releaseDate = getInt();
	        printer.printLine("Iloœæ stron: ");
	        int pages = getInt();
		return new Book(title, author, releaseDate, pages, publisher, isbn);

	}
	public Magazine readAndCreateMagazine(){
		printer.printLine("Tytu³: ");
        String title = sc.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = sc.nextLine();
        printer.printLine("Jêzyk: ");
        String language = sc.nextLine();
        printer.printLine("Rok wydania: ");
        int year = getInt();
        printer.printLine("Miesi¹c: ");
        int month = getInt();
        printer.printLine("Dzieñ: ");
        int day = getInt();
		return new Magazine(title, publisher, language, year, month, day);
	}
	public LibraryUser readAndCreateLibraryUser() {
		printer.printLine("Imiê");
        String firstName = sc.nextLine();
        printer.printLine("Nazwisko");
        String lastName = sc.nextLine();
        printer.printLine("Pesel");
        String pesel = sc.nextLine();
        return new LibraryUser(firstName, lastName, pesel);
    }

}
