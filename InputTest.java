import java.util.Scanner;

public class InputTest 
	{
	   public static void main(String[] args)
	   {
	      Scanner in = new Scanner(System.in);

	      // Pobranie pierwszej porcji danych.
	      System.out.print("Jak si� nazywasz? ");
	      String name = in.nextLine();

	      // Pobranie drugiej porcji danych.
	      System.out.print("Ile masz lat? ");
	      int age = in.nextInt();

	      // Wydruk danych w konsoli.
	      System.out.println("Witaj, u�ytkowniku" + name + ". W przysz�ym roku b�dziesz mie� " + (age + 1) + "lat.");
	   }
	}

