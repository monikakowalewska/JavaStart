package pl.zadanie;

import java.util.Arrays;

public class DataStore {
    public static final int MAX_ILOSC=110;
    private Computer[]computers;
    private int computerNumber;

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public int getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }
    public DataStore(){
        setComputers(new Computer[MAX_ILOSC]);
    }
    public void add(Computer computer){
        if (computerNumber < MAX_ILOSC) {
            computers[computerNumber] = computer;
            computerNumber++;
        } else {
            System.out.println("Maxymalna liczba komputerów zosta³a osi¹gniêta");
        }

    }

    @Override
    public String toString() {
        return "DataStore{" +
                "computers=" + Arrays.toString(computers) +
                ", computerNumber=" + computerNumber +
                '}';
    }
    public int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computerNumber; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }

}
