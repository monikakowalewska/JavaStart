package pl.javastart.zadania;

import java.util.Scanner;

public class FunString {
public static void main(String[] args) {
	int liczba;
	
	StringBuilder builder=new StringBuilder();
	System.out.println("Ile s³ów chcesz wprowadziæ?");
	Scanner odczyt=new Scanner(System.in);
	liczba=odczyt.nextInt();
	odczyt.nextLine();
	for(int i=0;i<liczba;i++){
		System.out.println("Podaj s³owo (ci¹g znaków)");
		
		String s³owo=odczyt.nextLine();
		System.out.println(s³owo);
		
		builder.append(s³owo.substring(s³owo.length()-1));//fajna konstrukcja, pomoc
		System.out.println("Nowe s³owo "+builder);
		
	}
	odczyt.close();
}
/*Rozwi¹zanie z javastart
 * Scanner input = new Scanner(System.in);

System.out.println("Podaj liczbê wyrazów: ");
int wordsNumber = input.nextInt();
input.nextLine();

String[] words = new String[wordsNumber];

for(int i=0; i<wordsNumber; i++) {
	System.out.println("Podaj kolejne s³owo: ");
	words[i] = input.nextLine();
}

StringBuilder build = new StringBuilder();
for(int i=0; i<wordsNumber; i++) {
	build.append(words[i].charAt(words[i].length() - 1));
}

System.out.println("Nowe s³owo: " + build.toString());

input.close();
}*/

}
