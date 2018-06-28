package pl.javastart.wyjatki;



public class TestWyjatek03 {
	public static void main(String[] args) {
        Wyjatek03 nums = new Wyjatek03();
        try {
            // wszystko ok
            nums.add(3, 5);// miejsce 3, wartosc 5
            // wszystko ok, pobieramy wczeœniej dodan¹ liczbê
            int number3 = nums.get(3);
            System.out.println(number3);
            // b³êdy indeks, wygenerowanie wyj¹tku
            nums.add(20, 20);//miejsce 20, wartosc 20
            // b³êdy indeks, gdyby kod dotar³ do tego miejsca
            //równie¿ wygenerowany zosta³by wyj¹tek
            int number20 = nums.get(20);
            System.out.println(number20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
