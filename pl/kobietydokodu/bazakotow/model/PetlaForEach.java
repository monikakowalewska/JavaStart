package pl.kobietydokodu.bazakotow.model;

public class PetlaForEach {
	public static void main(String args[]){
		int[] tablica = new int[10];
		//wype�nienie tablicy
		for(int i=0; i<10; i++)
		tablica[i] = i+1;
		//wy�wietlenie przy u�yciu p�tli for each
		for(int x : tablica)
		System.out.println(x);
		}

}
