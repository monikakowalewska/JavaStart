package pl.javastart.zadania00;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Company implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int EMPLOYEES = 3;
	private Employee[] employees;//tablica

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Company() {//jeœli tworzysz obiekt klasy Company to inicjalizujesz tablicê pracowników
		employees = new Employee[EMPLOYEES];
	}

	public void add(Employee emp, int index) {
		
		employees[index] = emp;//wska¿nik na tablicê;na pozycjê o nr index przyppipsz obiekt Employee
	}

/*private Employee[]tab;
public static final int EMPLOYEES = 3;
//pomoc 
public Employee[] getTab() {
	return tab;
}
public void setTab(Employee[] tab) {
	this.tab = tab;
}

public Company() {
	tab = new Employee[EMPLOYEES];
}

public void add(Employee emp, int index) {
	tab[index] = emp;
}

public static final String FILE_STORE = "employees.info";

Scanner odczyt = new Scanner(System.in);
int i;
String fileName = "person.txt";
public void zapiszDane(){
	Employee employee=new Employee();
	
	try
	{
	odczyt.nextLine();
	System.out.println("Podaj imiê");
	String y = odczyt.nextLine();
	employee.setFirstName(y);
	System.out.println("Nazwisko");
	y = odczyt.nextLine();
	employee.setLastName(y);
	System.out.println("wyplata");
	double x = odczyt.nextDouble();
	employee.setSalary(x);}
	catch(InputMismatchException e){
		System.out.println("Niew³aœciwe dane.Spróbuj jeszcze raz.");
	}
	
	boolean czynapelniona=true;
	while(i<tab.length){
		if(tab[i]==null){
		tab[i]=employee;
	System.out.println("Wpisano pracownika");
	czynapelniona=false;
	i++;
	break;}}
	if (czynapelniona==true){
		System.out.println("Brak wolnych miejsc");
	}
	try(
			FileOutputStream fs = new FileOutputStream(FILE_STORE,true);
			ObjectOutputStream os = new ObjectOutputStream(fs);//obudowanie klas¹ ObjectOutputStream
			) {
		for (int i = 0; i < Company.EMPLOYEES; i++) {//pobiera od razu wszystkich 3 pracowników
			try
			{
			odczyt.nextLine();
			System.out.println("Podaj imiê");
			String fn = odczyt.nextLine();
			employee.setFirstName(fn);
			System.out.println("Nazwisko");
			String ln = odczyt.nextLine();
			employee.setLastName(ln);
			System.out.println("wyplata");
			double s = odczyt.nextDouble();
			employee.setSalary(s);
			add(new Employee(fn, ln, s), i);
}
			catch(InputMismatchException e){
				System.out.println("Niew³aœciwe dane.Spróbuj jeszcze raz.");
			}
		
		os.writeObject(employee);//??
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Zapisano obiekt do pliku");
}
	public void odczytDanych(){
String fileName = "person.txt";
		
Employee employee=new Employee();
		
		try(
				FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis);//klasa opakowuj¹ca
				) {

		employee = (Employee) ois.readObject();//wymagane rzutowanie na odpowiedni typ, domyœlnie z klasy Object
		
		for(int i=0; i<Company.EMPLOYEES; i++) {
			System.out.println(getEmployees()[i]);
		}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if(employee != null) {
			System.out.println("Wczytano dane o: ");
			System.out.println(employee.getFirstName() + " " + employee.getLastName()+" "+employee.getSalary());
		}
	}
	private char[][] getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	
}

