package Przeci¹¿anieMetod;

public class Calculator {
    double a;
    double b;
    double c;
    double add(double a, double b){
        return a+b;
    }
    double add(double a,double b, double c){
        double result=a+b+c;
        return result;
    }
    int subtract(int a, int b){
        return a-b;
    }
    void subtract (int a, int b, int c){
        System.out.println(subtract(a, b)-c);
    }
}
