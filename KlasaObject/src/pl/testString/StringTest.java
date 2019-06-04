package pl.testString;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        Scanner sc =new Scanner(System.in);
        System.out.println("Ile s³ów chcesz wpisaæ");
        int liczba=sc.nextInt();
        sc.nextLine();
        String[] words = new String[liczba];

        for (int i = 0; i < liczba; i++) {
            System.out.println("Podaj kolejne s³owo: ");
            words[i] = sc.nextLine();
            builder.append(words[i].charAt(words[i].length() - 1));
        }

        String s³owo=builder.toString();
        System.out.println("nowe s³owo"+" "+s³owo);
    }
}
