package pl.kobietydokodu.bazakotow.model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class OperacjeScanner {
	public static void main(String[] args)
	{
		System.out.println("Podaj liczb� typu double z przecinkiem w �rodku");
		double zmienna1;
		Scanner odczytZmienna1=new Scanner(System.in);
		zmienna1=odczytZmienna1.nextDouble();
		System.out.println("Twoja liczba to "+zmienna1);
		
		System.out.println("Podaj drug� liczb� typu double z przecinkiem w �rodku");
		double zmienna2;
		Scanner odczytZmienna2=new Scanner(System.in);
		zmienna2=odczytZmienna2.nextDouble();
		System.out.println("Twoja liczba to "+zmienna2);
		
		System.out.println("Na pewno ciekawi ci�, jakie b�d� suma, r�nica, iloczyn i iloraz tych liczb."
				+ " W�a�nie to dla ciebie zrobimy ");
		double suma= zmienna1+zmienna2;
		double roznica= zmienna1-zmienna2;
		double iloczyn=zmienna1*zmienna2;
		double iloraz=zmienna1/zmienna2;
		System.out.println("Suma liczb wynosi "+suma);
		System.out.println("R�nica to "+roznica);
		System.out.println("Iloczyn wynosi "+iloczyn);
		System.out.println("Iloraz r�wna si� "+iloraz);
		
		System.out.println("Chcesz dowiedzie� si� ile wyniesie liczba pierwsza podniesiona do pot�gi liczby drugiej?");
		System.out.println("Je�li tak wci�nij literke t, je�li nie wci�nij literk� n");
		String litera;
		Scanner odczytLitera = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
		litera = odczytLitera.nextLine();
		//boolean found;
		double potega=Math.pow(zmienna1, zmienna2);
		Pattern pat=Pattern.compile("t");
		Matcher mat=pat.matcher(litera);
		//found=mat.matches();
		if(mat.matches())
		{System.out.println("Pot�ga "+potega);
		System.out.println("Brawo za wytrwa�o��!");
		}
		else
		{System.out.println("Dzi�kuj� za po�wi�cony czas");
		}
		
	//przyk�ad z javastart
		System.out.println("Podaj imie");
		String imie; //w nim zapiszemy swoje imie
		Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
		imie = odczyt.nextLine();
		System.out.println("Jeste� �wietny "+imie); //wy�wietlamy powitanie
		
		System.out.println("Podaj liczb� ca�kowit�");
		int zmiennaA;
		Scanner odczytZmiennaA=new Scanner(System.in);
		zmiennaA=odczytZmiennaA.nextInt();
		
		System.out.println("Podaj drug� liczb� ca�kowit�");
		int zmiennaB;
		Scanner odczytZmiennaB=new Scanner(System.in);
		zmiennaB=odczytZmiennaB.nextInt();
		
		if (zmiennaA==zmiennaB){
			System.out.println("Podane liczby s� r�wne");
		}
		else if(zmiennaA>zmiennaB){
			System.out.println("Pierwsza liczba jest wi�ksza od drugiej");
		}
		else {
			System.out.println("Druga liczba jest wi�ksza od pierwszej");
		};
		
		System.out.println("Czy my si� znamy? Podaj swoje imi�");
		String imionko;
		Scanner odczytImionko=new Scanner(System.in);
		imionko=odczytImionko.nextLine();
		switch(imionko){
		case "Waldek":
			System.out.println("Witaj m�j ukochany");
		break;
		case "Maurycy":
			System.out.println("Przecie� nie masz tak na imi�");
		break;
		case "Dexter":
			System.out.println("Jeste� morderc�?");
			break;
		case"Wiktor":
			System.out.println("Witaj syneczku - porz�dna firmo");
			break;
		case"Laura":
			System.out.println("Cze�� wspania�a c�reczko");
			break;
		case "Monika":
			System.out.println("Cze�� Mistrzunio");
			break;
		case"Monia":
			System.out.println("Dlaczego zdrabniasz swoje imi�");
			break;
		case"Waldeczek":
			System.out.println("Witaj m�j s�odziaczku");
			break;
		default:
		System.out.println("Chyba si� nie znamy");
		
	
		}
	
		}
		}
