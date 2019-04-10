package Przeci¹¿anieMetod;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.add(2.3,4.2));
        System.out.println(calc.add(4.5,6.1,2.1));
        System.out.println(calc.subtract(20,3));
        calc.subtract(50,32,12);
    }
}
