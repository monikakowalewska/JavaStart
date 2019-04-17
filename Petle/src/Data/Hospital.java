package Data;

import java.util.Arrays;

public class Hospital {
    final int MAX_ILOSC = 10;
    Patient[] tab = new Patient[MAX_ILOSC];
    int patientNumber = 0;

    public void addPatient(Patient patient) {
        if (patientNumber < MAX_ILOSC) {
            tab[patientNumber] = patient;
            patientNumber++;
        } else {
            System.out.println("Limit miejsc zosta³ wyczerpany.");
        }
    }

    public void printPatients() {
        for (int i = 0; i < patientNumber; i++) {
            System.out.println(tab[i].getFirstName() + " "
                    + tab[i].getLastName() + " "
                    + tab[i].getPesel());

        }
    }
}
