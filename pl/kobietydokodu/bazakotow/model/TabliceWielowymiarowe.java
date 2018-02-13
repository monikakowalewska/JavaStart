package pl.kobietydokodu.bazakotow.model;

public class TabliceWielowymiarowe {
	public static void main(String[] args) {
		int[][] tablica = new int[2][3];
		for (int i = 0; i < tablica.length; i++)
			for (int j = 0; j < tablica[i].length; j++)
				System.out.println(tablica[i][j] = tablica[i].length * i + j);

		for (int i = 0; i < tablica.length; i++)
			for (int j = 0; j < tablica[i].length; j++)
				System.out.println("Miejsce w tablicy to " + i + "," + j + " a wartoœæ to " + tablica[i][j]);

		System.out.println("=========WHILE=================");
		int i = 0;
		int j = 0;
		while (i < tablica.length) {
			while (j < tablica[i].length) {
				System.out.println("Miejsce w tablicy to " + i + "," + j + " a wartoœæ to " + tablica[i][j]);
				j++;
			}
			j=0;
			i++;
		}

		/*
		 * for(int i=0; i< tablica.length; i++){ for(int j=0; j<
		 * tablica[i].length; j++) System.out.print(tablica[i][j]);
		 * System.out.println();
		 */
		/* } */
	}
}
