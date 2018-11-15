package pl.javastart.zadania;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;
import java.util.Set;

public class CompanyApp {
	public static final int READ_FROM_USER = 1;
	public static final int SEARCH_FROM_FILE = 2;
	public static final int EXIT = 3;

	public static void main(String[] args) {

		Map<String, Employee> emplo = new HashMap<>();
		Scanner input = new Scanner(System.in);
		int option = 0;
		while (option != EXIT) {
			System.out.println("Wprowadzenie dane pracownik�w - " + READ_FROM_USER);
			System.out.println("Wyszukaj dane pracownika - " + SEARCH_FROM_FILE);
			System.out.println("Wyj�cie z programu - " + EXIT);

			option = input.nextInt();

			if (option == READ_FROM_USER) {

				writeData(emplo);

			} else if (option == SEARCH_FROM_FILE) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Kogo chcesz znalezc? Podaj imi� i nazwisko");
				String key = scan.nextLine();

				System.out.println(emplo.get(key));
				if (key == null)
					System.out.println("Nie ma takiego pracownika");

			} else if (option == EXIT) {
				return;
			}
		}

		input.close();
	}

	private static void writeData(Map<String, Employee> emp) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Wprowad� imi�: ");
			String fn = sc.nextLine();
			System.out.println("Wprowad� nazwisko: ");
			String ln = sc.nextLine();
			System.out.println("Wprowad� wyp�at�: ");
			double salary = sc.nextDouble();
			sc.nextLine();

			emp.put(fn + " " + ln, new Employee(fn, ln, salary));
			System.out.println("Ilo�� pracownik�w: " + emp.size());

			Collection<Employee> values = emp.values();// wypisanie wszystkich
														// warto�ci
			System.out.println("Warto�ci:\n" + values);

			Set<String> keySet = emp.keySet();// wypisanie wszystkich kluczy
			System.out.println("Klucze:\n" + keySet);

			System.out.println("Klucze i warto�ci:\n");
			Set<Entry<String, Employee>> entrySet = emp.entrySet();
			for (Entry<String, Employee> entry : entrySet) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}

		}
	}
}
