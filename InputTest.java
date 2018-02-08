import java.util.Scanner;

public class InputTest 
	{
	   public static void main(String[] args)
	   {
	      Scanner in = new Scanner(System.in);

	      // Pobranie pierwszej porcji danych.
	      System.out.print("Jak siê nazywasz? ");
	      String name = in.nextLine();

	      // Pobranie drugiej porcji danych.
	      System.out.print("Ile masz lat? ");
	      int age = in.nextInt();

	      // Wydruk danych w konsoli.
	      System.out.println("Witaj, u¿ytkowniku" + name + ". W przysz³ym roku bêdziesz mieæ " + (age + 1) + "lat.");
	   }
	}

