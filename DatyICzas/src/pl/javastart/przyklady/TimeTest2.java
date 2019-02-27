package pl.javastart.przyklady;

import java.time.LocalTime;
/*Przyk�adowy program, kt�ry ustawia zegarek na godzin� aktualn�, a nast�pnie co sekund� (przez 10 kolejnych sekund) wy�wietla zaktualizowan� godzin�.*/
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
