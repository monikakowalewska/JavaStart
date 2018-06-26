package pl.javastart.zadania;

import java.util.Scanner;

public class FunString {
public static void main(String[] args) {
	int liczba;
	
	StringBuilder builder=new StringBuilder();
	System.out.println("Ile s��w chcesz wprowadzi�?");
	Scanner odczyt=new Scanner(System.in);
	liczba=odczyt.nextInt();
	odczyt.nextLine();
	for(int i=0;i<liczba;i++){
		System.out.println("Podaj s�owo (ci�g znak�w)");
		
		String s�owo=odczyt.nextLine();
		System.out.println(s�owo);
		
		builder.append(s�owo.substring(s�owo.length()-1));//fajna konstrukcja, pomoc
		System.out.println("Nowe s�owo "+builder);
		
	}
	odczyt.close();
}
/*Rozwi�zanie z javastart
 * Scanner input = new Scanner(System.in);

System.out.println("Podaj liczb� wyraz�w: ");
int wordsNumber = input.nextInt();
input.nextLine();

String[] words = new String[wordsNumber];

for(int i=0; i<wordsNumber; i++) {
	System.out.println("Podaj kolejne s�owo: ");
	words[i] = input.nextLine();
}

StringBuilder build = new StringBuilder();
for(int i=0; i<wordsNumber; i++) {
	build.append(words[i].charAt(words[i].length() - 1));
}

System.out.println("Nowe s�owo: " + build.toString());

input.close();
}*/

}
