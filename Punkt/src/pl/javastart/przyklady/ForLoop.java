package pl.javastart.przyklady;

public class ForLoop {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		//uzupe�niamy tablic�
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		//wy�wietlamy tablic�
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Liczba: " + numbers[i]);
		}
	}

}
