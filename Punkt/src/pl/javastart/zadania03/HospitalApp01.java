package pl.javastart.zadania03;


import pl.javastart.zadania.Person;
import pl.javastart.zadania02.Doctor;
import pl.javastart.zadania02.Nurse;

public class HospitalApp01 {
public static void main(String[] args) {
	Hospital hosp=new Hospital();
	
	Person doctor=new Doctor("Magda","Macio³ek",4000.76,1460.34);
	hosp.addPerson(doctor);
	System.out.println(((Doctor)doctor).toString());
	System.out.println(hosp.toString());
	
	Person nurse=new Nurse("Laura","Pecia",2000.34,10);
	hosp.addPerson(nurse);
	System.out.println(nurse.toString());
	
	Person nurse2=new Nurse("Zofia","Gliniecka",2000.34,8);
	hosp.addPerson(nurse2);
	System.out.println(nurse2.toString());
	
	System.out.println(hosp.toString());
	
}
}
