package pl.javastart.zadania00;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CompanyApp {
	public static final String FILE_STORE = "employees.info";
	public static final int READ_FROM_USER = 1;
	public static final int READ_FROM_FILE = 2;
	


	public static void main(String[] args) {
//		CompanyApp oc = new CompanyApp(); jeœli utworzymy obiekt to metody writeData i readData nie musz¹ 
		//byæ statyczne ale wywo³ane przez referencje do obiektu
		Company company = new Company();

		Scanner input = new Scanner(System.in);
		System.out.println("Wprowadzenie dane pracowników - " + READ_FROM_USER);
		System.out.println("Wczytanie danych pracowników - " + READ_FROM_FILE);

		int option = input.nextInt();
		

		if (option == READ_FROM_USER) {
			writeData(company);
		} else if (option == READ_FROM_FILE) {
			readData(company);
		}
		input.close();
	}

	private static void writeData(Company company) {
		try (	Scanner sc = new Scanner(System.in);
				FileOutputStream fos = new FileOutputStream(FILE_STORE);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			for (int i = 0; i < Company.EMPLOYEES; i++) {
				System.out.println("WprowadŸ imiê: ");
				String fn = sc.nextLine();
				System.out.println("WprowadŸ nazwisko: ");
				String ln = sc.nextLine();
				System.out.println("WprowadŸ wyp³atê: ");
				double salary = sc.nextDouble();
				sc.nextLine();

				company.add(new Employee(fn, ln, salary), i);
			}

			oos.writeObject(company);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readData(Company company) {
		try (	FileInputStream fis = new FileInputStream(FILE_STORE);
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			company = (Company) ois.readObject();
			
			for(int i=0; i<Company.EMPLOYEES; i++) {
				System.out.println(company.getEmployees()[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
	/*Company com=new Company();
	int i=0;
	
	while(i!=2){
		System.out.println("0- zapisz do pliku pracownika");
		System.out.println("1- odczyt danych");
		System.out.println("2 - wyjœcie");
		Scanner odczyt=new Scanner(System.in);
		i=odczyt.nextInt();
	
	switch(i){
	case 1:{
		Employee employee = null;
		try{
			com.odczytDanych();
			}
			catch(ClassCastException e){
				e.printStackTrace();
			}
	}
	break;
	case 0:{
		com.zapiszDane();
		
	}
	break;
	
	default:{
		System.out.println("Nieprzewidziana sytuacja");
	}
	}
}
}*/
