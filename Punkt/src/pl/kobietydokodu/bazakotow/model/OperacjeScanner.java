package pl.kobietydokodu.bazakotow.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class OperacjeScanner {
	public static void main(String[] args)
	{
		System.out.println("Podaj liczbê typu double z przecinkiem w œrodku");
		double zmienna1;
		Scanner odczytZmienna1=new Scanner(System.in);
		zmienna1=odczytZmienna1.nextDouble();
		System.out.println("Twoja liczba to "+zmienna1);
		
		System.out.println("Podaj drug¹ liczbê typu double z przecinkiem w œrodku");
		double zmienna2;
		Scanner odczytZmienna2=new Scanner(System.in);
		zmienna2=odczytZmienna2.nextDouble();
		System.out.println("Twoja liczba to "+zmienna2);
		
		System.out.println("Na pewno ciekawi ciê, jakie bêd¹ suma, ró¿nica, iloczyn i iloraz tych liczb."
				+ " W³aœnie to dla ciebie zrobimy ");
		double suma= zmienna1+zmienna2;
		double roznica= zmienna1-zmienna2;
		double iloczyn=zmienna1*zmienna2;
		double iloraz=zmienna1/zmienna2;
		System.out.println("Suma liczb wynosi "+suma);
		System.out.println("Ró¿nica to "+roznica);
		System.out.println("Iloczyn wynosi "+iloczyn);
		System.out.println("Iloraz równa siê "+iloraz);
		
		System.out.println("Chcesz dowiedzieæ siê ile wyniesie liczba pierwsza podniesiona do potêgi liczby drugiej?");
		System.out.println("Jeœli tak wciœnij literke t, jeœli nie wciœnij literkê n");
		String litera;
		Scanner odczytLitera = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		litera = odczytLitera.nextLine();
		//boolean found;
		double potega=Math.pow(zmienna1, zmienna2);
		Pattern pat=Pattern.compile("t");
		Matcher mat=pat.matcher(litera);
		//found=mat.matches();
		if(mat.matches())
		{System.out.println("Potêga "+potega);
		System.out.println("Brawo za wytrwa³oœæ!");
		}
		else
		{System.out.println("Dziêkujê za poœwiêcony czas");
		}
		
	//przyk³ad z javastart
		System.out.println("Podaj imie");
		String imie; //w nim zapiszemy swoje imie
		Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		imie = odczyt.nextLine();
		System.out.println("Jesteœ œwietny "+imie); //wyœwietlamy powitanie
		
		System.out.println("Podaj liczbê ca³kowit¹");
		int zmiennaA;
		Scanner odczytZmiennaA=new Scanner(System.in);
		zmiennaA=odczytZmiennaA.nextInt();
		
		System.out.println("Podaj drug¹ liczbê ca³kowit¹");
		int zmiennaB;
		Scanner odczytZmiennaB=new Scanner(System.in);
		zmiennaB=odczytZmiennaB.nextInt();
		
		if (zmiennaA==zmiennaB){
			System.out.println("Podane liczby s¹ równe");
		}
		else if(zmiennaA>zmiennaB){
			System.out.println("Pierwsza liczba jest wiêksza od drugiej");
		}
		else {
			System.out.println("Druga liczba jest wiêksza od pierwszej");
		};
		
		System.out.println("Czy my siê znamy? Podaj swoje imiê");
		String imionko;
		Scanner odczytImionko=new Scanner(System.in);
		imionko=odczytImionko.nextLine();
		switch(imionko){
		case "Waldek":
			System.out.println("Witaj mój ukochany");
		break;
		case "Maurycy":
			System.out.println("Przecie¿ nie masz tak na imiê");
		break;
		case "Dexter":
			System.out.println("Jesteœ morderc¹?");
			break;
		case"Wiktor":
			System.out.println("Witaj syneczku - porz¹dna firmo");
			break;
		case"Laura":
			System.out.println("Czeœæ wspania³a córeczko");
			break;
		case "Monika":
			System.out.println("Czeœæ Mistrzunio");
			break;
		case"Monia":
			System.out.println("Dlaczego zdrabniasz swoje imiê");
			break;
		case"Waldeczek":
			System.out.println("Witaj mój s³odziaczku");
			break;
		default:
		System.out.println("Chyba siê nie znamy");
		
	
		}
	
		}
		}
