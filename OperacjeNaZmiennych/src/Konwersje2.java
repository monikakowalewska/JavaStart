public class Konwersje2 {
    public static void main(String[] args) {
        char letter1 = 'k';
        char letter2 = 'o';
        char letter3 = 't';
        System.out.println("B��dne \"sumowanie\" znak�w");
        System.out.println(letter1 + letter2 + letter3);
        System.out.println("Tekst jawny");
        System.out.println("" + letter1 + letter2 + letter3);
        letter1++;
        letter2++;
        letter3++;
        System.out.println("Tekst zaszyfrowany");
        System.out.println("" + letter1 + letter2 + letter3);
    }

}
