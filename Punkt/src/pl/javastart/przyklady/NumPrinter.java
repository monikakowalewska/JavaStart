package pl.javastart.przyklady;

public class NumPrinter {//break i continue w petli
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println("Pierwsza p�tla: "+i);
		}
		
		for(int i=0; i<10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("Druga p�tla "+i);
		}
	}

}
