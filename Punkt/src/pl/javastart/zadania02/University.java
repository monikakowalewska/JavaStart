package pl.javastart.zadania02;

import pl.javastart.zadania.Student;

public class University {
public static void main(String[] args) {
	Student student1=new Student("Marek","Kowalski",12345);
	Student student2=new Student("Wojtek","Madej",23456);
	System.out.println("Liczba studentów to "+Student.liczbaStudentow);
}
}
