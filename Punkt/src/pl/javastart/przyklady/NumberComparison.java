package pl.javastart.przyklady;

public class NumberComparison {
	public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int c = 50;
         
        if(a > b) {
            if(a > c)
                System.out.println("A jest wiêksze od B oraz od C!");
            else
                System.out.println("A jest wiêksze od B, ale mniejsze od C");
        } else {
            System.out.println("A jest mniejsze od B");
        }
    }

}
