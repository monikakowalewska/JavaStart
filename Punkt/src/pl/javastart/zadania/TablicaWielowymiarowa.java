package pl.javastart.zadania;

public class TablicaWielowymiarowa {
public static void main(String[] args) {
	
	double[][]tab=new double[3][3];
	
	//dla wygody mo�na zrobi� trzy tablice jednowymiarowe
	double[] line0 = {1.0, 1.5, 2.0};
	double[] line1 = {1.5, 2.0, 2.5};
	double[] line2 = {2.0, 2.5, 3.0};
	tab[0] = line0;
	tab[1] = line1;
	tab[2] = line2;
	

//moje rozwi�zanie
	tab[0][0]=1.0;
	tab[0][1]=1.5;
	tab[0][2]=2.0;
	tab[1][0]=1.5;
	tab[1][1]=2.0;
	tab[1][2]=2.5;
	tab[2][0]=2.0;
	tab[2][1]=2.5;
	tab[2][2]=3.0;
	double iloczyn1=tab[0][0]*tab[1][1]*tab[2][2];//iloczyn jednej przekatnej
	System.out.println(iloczyn1);
	System.out.println("Suma iloczynow obu przek�tnych to ");
	System.out.println(iloczyn1+(tab[0][2]*tab[1][1]*tab[2][0]));
	System.out.println("Iloczyn sum �rodkowego wiersza i �rodkowej kolumny tablicy ");
	double iloczyn2=(tab[1][0]+tab[1][1]+tab[1][2])*(tab[0][1]+tab[1][1]+tab[2][1]);
	System.out.println(iloczyn2);
	System.out.println("Sum� wszystkich element�w znajduj�cych si� przy kraw�dzi tablicy");
	double suma=tab[0][0]+tab[0][1]+tab[0][2]+tab[1][0]+tab[1][2]+tab[2][0]+tab[2][1]+tab[2][2];
	System.out.println(suma);
}
}
