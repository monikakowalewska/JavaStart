package Jednostki;

public class LengthUnit {
    double metrNaCent(double a){
        return a*100;
    }
    double metrNaMili(double a){
        return a*1000;
    }
    double centNaMetr(double a){
        return a/100;
    }
    double miliNaMetr(double a){
        return a/1000;
    }
}
