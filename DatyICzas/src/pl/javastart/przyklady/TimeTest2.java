package pl.javastart.przyklady;

import java.time.LocalTime;
/*Przyk³adowy program, który ustawia zegarek na godzinê aktualn¹, a nastêpnie co sekundê (przez 10 kolejnych sekund) wyœwietla zaktualizowan¹ godzinê.*/
public class TimeTest2 {
	 public static void main(String[] args) throws InterruptedException {
	        LocalTime now = LocalTime.now();

	        for (int i = 0; i < 10; i++) {
	            System.out.println(now);
	            now = now.plusSeconds(1);
	            Thread.sleep(1000);
	        }
	    }

}
