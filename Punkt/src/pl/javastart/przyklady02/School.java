package pl.javastart.przyklady02;

import pl.javastart.przyklady.Student;

public class School {
	public static void main(String[] args) {
		Student student1 = new Student("Jan", "Kowalski");
		Student student2 = new Student("Jan", "Kowalski");
		System.out.println("student1 == student2:");
		System.out.println(student1 == student2);
		System.out.println("student1.equals(student2):");
		System.out.println(student1.equals(student2));
		Student student3 = new Student("Janna", "Kowalski");
		Student student4 = student3;
		System.out.println("student3 == student4:");
		System.out.println(student3 == student4);
		System.out.println("student3.equals(student4):");
		System.out.println(student3.equals(student4));
		System.out.println("Lista studentów: ");
		student1.printInfo();
		System.out.println(student1);//dziêki metodzie toString
		String student3Desc = student3.toString();//przypisanie opisu obiektu do zmiennej
		System.out.println(student3Desc);
		Student[] students = new Student[3];
		students[0] = new Student("Jan", "Kowalski");
		students[1] = new Student("Maria", "Zawi³a");
		students[2] = new Student("Koral", "Gol");
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}

	}

}
