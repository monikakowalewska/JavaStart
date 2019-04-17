package App;

import Data.Hospital;
import Data.Patient;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int WYJSCIE=0;
        final int DODAJ=1;
        final int WYSWIETL=2;
        Scanner sc=new Scanner(System.in);
        Hospital hosp=new Hospital();
        int option=-1;
        while (option != WYJSCIE) {

            System.out.println("Menu:\n 0-wyjœcie z programu\n 1-dodaj pacjenta\n 2-wyœwietl listê pacjentów");

            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case DODAJ:
                    Patient patient = new Patient();
                    System.out.println("Imiê: ");
                    patient.setFirstName(sc.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(sc.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(sc.nextLine());
                    hosp.addPatient(patient);
                    break;
                case WYSWIETL:
                    hosp.printPatients();
                    break;
                case WYJSCIE:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }

        }
        sc.close();
    }
}
