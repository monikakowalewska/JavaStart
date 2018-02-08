package pl.kobietydokodu.bazakotow.model;

public class Petla {
	public static void main (String args[]){
		int i=0;
		do
		{
			
			i++;
			if (i==1)
			{
				continue;
			}
			
			System.out.println(i);
		}
		while(i<7);
	}

}
