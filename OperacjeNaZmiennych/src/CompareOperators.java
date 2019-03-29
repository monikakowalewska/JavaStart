public class CompareOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.print("Czy X jest wiêkszy od Y? ");
        System.out.println(x > y);

        System.out.print("Czy X jest ró¿ny od Y? ");
        System.out.println(x != y);

        boolean instance = "Kasia" instanceof java.lang.String;
        System.out.println(instance); // "Kasia" jest typu String
    }

}
