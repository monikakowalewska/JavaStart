package Metody;

public class Calculate {
    public static void main(String[] args) {
        double a=15.3;
        double b=12.66;
        Calculator calc=new Calculator();
        System.out.println(calc.add(a,b));
        System.out.println(calc.subtract(a,b));
        System.out.println(calc.multiply(a,b));
        System.out.println(calc.divide(a,b));
    }
}
