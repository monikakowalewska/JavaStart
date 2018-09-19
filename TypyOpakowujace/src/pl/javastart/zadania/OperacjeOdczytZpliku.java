package pl.javastart.zadania;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;


public class OperacjeOdczytZpliku {
	public static void main(String[] args) {
		String fileName = "operacjeFile.txt";
		Paczka paczka = null;

		{
			try (FileInputStream fis = new FileInputStream(fileName);
					ObjectInputStream ois = new ObjectInputStream(fis);) {
				paczka = (Paczka) ois.readObject();

				for (int i = 0; i < 5; i++) {
					System.out.println(paczka.getTab()[i]);

				}
			} catch (FileNotFoundException e) {
				System.err.println("Nie znaleziono pliku");
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("B³¹d odczytu danych");
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String number1 = paczka.getTab()[0];
			int num1 = Integer.parseInt(number1);
			String number2 = paczka.getTab()[1];
			int num2 = Integer.parseInt(number2);
			String number3 = paczka.getTab()[2];
			int num3 = Integer.parseInt(number3);
			int sumInt = num1 + num2 + num3;
			System.out.println("Suma trzech pierwszych liczb to " + sumInt);
			String number4 = paczka.getTab()[3];
			BigInteger big1 = BigInteger.valueOf(Long.parseLong(number4));
			String number5 = paczka.getTab()[4];
			BigInteger big2 = BigInteger.valueOf(Long.parseLong(number5));
			BigInteger sumBig = big1.add(big2);
			System.out.println("Suma wilekich liczb to " + sumBig);

			/*
			 * if(paczka != null) { System.out.println("Wczytano dane o: ");
			 * System.out.println(paczka); }
			 */
		}

	}
}
