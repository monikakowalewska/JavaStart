package pl.javastart.zadania;

public class Tablice {
	static int suma (int p1, int p2, int p3){
		return (p1+p2+p3);
		};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]tab1={5,8,16};
		
	int[]tab2=new int[3];
	tab2[0]=11;
	tab2[1]=55;
	tab2[2]=32;
	System.out.println("Suma wszystkich elementów dwóch tablic to ");
		System.out.println((int)tab1[0]+tab1[1]+tab1[2]+tab2[0]+tab2[1]+tab2[2]);
	System.out.println(tab1.length);
	Tablice.suma (tab2[0],tab2[1],tab2[2]);
	System.out.println(suma (tab2[0],tab2[1],tab2[2]));
	suma(tab1[0],tab1[1],tab1[2]);
	System.out.println(suma(tab1[0],tab1[1],tab1[2]));
	

			
	}

	
	}

