package Przyklady;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAdder {
    public static void main(String[] args) {
        int[] array = createEvenArray(5);
        System.out.println(Arrays.toString(array));
        array=reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * @param size - number of elements to read
     * @return array containing even numbers
     */
    private static int[] createEvenArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[size];
        int licznik=0;
        while(licznik<5)
         {
            System.out.println("Podaj kolejn¹ liczbê:");
            int next = scanner.nextInt();
            if(isEven(next))
            {result[licznik]=next;
            licznik++;}
        }
        return result;
    }

    /**
     *
     * @param number - number to be checked
     * @return true if number is even, or false otherwise
     */
    private static boolean isEven(int number) {

        return number %2== 0;
    }

    /**
     * @param array - array to be reversed
     * @return - reversed array
     */
    private static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[reversed.length-i-1]=array[i];
        }
        return reversed;
    }

}
