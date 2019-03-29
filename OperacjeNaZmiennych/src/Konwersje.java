public class Konwersje {
    public static void main(String[] args) {
        double number1 = 10.987;
        int number2 = 5;

        // konwersja zawê¿aj¹ca (eng. narrowing)
        int narrowing = (int) number1;

        // konwersja rozszerzaj¹ca (eng. widening)
        double widening = (double) number2;

        System.out.println("Narrowing: " + narrowing);
        System.out.println("Widening: " + widening);
    }

}
