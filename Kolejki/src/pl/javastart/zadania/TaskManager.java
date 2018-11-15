package pl.javastart.zadania;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class TaskManager {
	public static final int ADD_TASK = 0;
	public static final int TAKE_TASK = 1;
	public static final int EXIT = 2;
public static void main(String[] args) {
	Queue<Task> kolejkaZadan = new PriorityQueue<>(new Comparator<Task>() {
		@Override
		public int compare(Task o1, Task o2) {
			return -o1.getPrior().compareTo(o2.getPrior());
		}
	});
	TaskManager tm=new TaskManager();
	try (Scanner sc = new Scanner(System.in);) {
		int userOption;
		do {
			tm.printOptions();
			userOption = sc.nextInt();
			sc.nextLine();
			
			switch(userOption) {
			case TaskManager.ADD_TASK:
				tm.addTask(kolejkaZadan);
				break;
			case TaskManager.TAKE_TASK:
				tm.pobierzZadanieOnajwyzszymPriorytecie(kolejkaZadan);
				break;
			case TaskManager.EXIT:
				break;
			}
		} while (userOption != TaskManager.EXIT);
	}
}
private void printOptions() {
	System.out.println("0 - dodanie zadania");
	System.out.println("1 - pobierz kolejne zadanie o najwy¿szym priorytecie");
	System.out.println("2 - Wyjœcie z programu");
}
private void addTask(Queue<Task> kolejkaZadan) {
	 Scanner sc = new Scanner(System.in); 
	Task task = new Task();

	System.out.println("Dodawanie zadania.");
	System.out.println("Nazwa ");
	String n=sc.nextLine();
	System.out.println("Opis ");
	String d=sc.nextLine();
	System.out.println("Priorytet () ");
	String p=sc.nextLine();
	kolejkaZadan.offer(new Task(n,d,p));
	System.out.println("Stan kolejki: " + kolejkaZadan+ "\n");
/*	//for(Task x : kolejkaZadan) - inna mo¿liwoœæ wyœwietlenia wszystkiego
		System.out.println(x);*/
}
private void pobierzZadanieOnajwyzszymPriorytecie(Queue<Task> kolejkaZadan ){
	
	System.out.println("Metoda poll(): " + kolejkaZadan.poll());
}
}
