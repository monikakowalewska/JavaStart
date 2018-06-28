package pl.javastart.zadania01;

import java.util.InputMismatchException;
import java.util.Scanner;

import pl.javastart.zadania02.UnkownOperatorException;

public class Kalkulator {
	private double liczba1;
	private double liczba2;
	private double liczba;

	public double getLiczba1() {
		return liczba1;
	}

	public void setLiczba1(double liczba1) {
		this.liczba1 = liczba1;
	}

	public double getLiczba2() {
		return liczba2;
	}

	public void setLiczba2(double liczba2) {
		this.liczba2 = liczba2;
	}

	Scanner odczyt = new Scanner(System.in);

/*	public void pobierzLiczbe(){
		for(int i=0;i<2;i++){
			System.out.println("Podaj liczbê");
			boolean error = true;
			while (error) {
				double liczba=odczyt.nextDouble();
				setLiczba(liczba);
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Podaj liczbê z przecinkiem w œrodku ");
				odczyt.nextLine();
			}
			}
		System.out.println("Poda³eœ " + liczba);
		}*/
	
	public void pobierzLiczbe1() {

		System.out.println("Podaj pierwsz¹ liczbê ");

		boolean error = true;
		while (error) {
			try {
				liczba1 = odczyt.nextDouble();
				setLiczba1(liczba1);

				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Podaj liczbê z przecinkiem w œrodku ");
				odczyt.nextLine();
			}
		}
		System.out.println("Poda³eœ " + liczba1);
	}

	public void pobierzLiczbe2() {
		odczyt.nextLine();
		System.out.println("Podaj drug¹ liczbê ");

		boolean error = true;
		while (error) {
			try {
				liczba2 = odczyt.nextDouble();
				setLiczba2(liczba2);

				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Podaj liczbê z przecinkiem w œrodku ");
				odczyt.nextLine();
			}
		}
		odczyt.nextLine();
		System.out.println("Poda³eœ " + liczba2);
	}

	public void pobierzOperator() throws UnkownOperatorException {
		System.out.println("Co chcesz zrobiæ? Wpisz +, -, *,/");
		String operator;
		/* odczyt.nextLine(); */
		operator = odczyt.nextLine();
		if (operator != "+" && operator != "-" && operator != "*" && operator != "/") {
			throw new UnkownOperatorException("Nie ma takiego operatora");
		} else {
			switch (operator) {
			case "+": {
				System.out.println("Suma tych liczb to " + add());
				break;
			}
			case "-":

				System.out.println("Ró¿nica tych liczb to " + subtract());
				break;
			case "*":

				System.out.println("Iloczyn tych liczb to " + multiply());
				break;
			case "/":

				System.out.println("Ró¿nica tych liczb to " + divide());

				break;

			default:

				System.out.println("nieprzewidziana sytuacja");
			}
		}
	}

	public double add() {
		return liczba1 + liczba2;
	}

	public double subtract() {
		return liczba1 - liczba2;
	}

	public double multiply() {
		return liczba1 * liczba2;
	}

	public double divide() throws ArithmeticException {
		if (liczba2 == 0) {
			throw new ArithmeticException("Uwa¿aj dzielisz przez 0");
		}
		return liczba1 / liczba2;
	}

	public double getLiczba() {
		return liczba;
	}

	public void setLiczba(double liczba) {
		this.liczba = liczba;
	}

}
