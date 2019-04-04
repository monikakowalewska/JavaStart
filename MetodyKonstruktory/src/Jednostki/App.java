package Jednostki;

public class App {
    public static void main(String[] args) {
        LengthUnit lu=new LengthUnit();
        System.out.println("Zamieñ 15.3 metrów na centymetry "+lu.metrNaCent(15.3));
        System.out.println("Zamieñ 100045.9 milimetrów na metry "+lu.miliNaMetr(100045.9));
        System.out.println("Zamieñ 3.5 centymetrów na milimetry "+lu.metrNaMili(lu.centNaMetr(3.5)));
        TimeUnit tu=new TimeUnit();
        System.out.println("Zamieñ 14 godz na minuty "+tu.godzNaMinuty(14.0));
        System.out.println("Zamieñ 16 godz na milisekundy "+
                tu.sekNaMilisek(tu.minutyNaSek(tu.godzNaMinuty(16))));
    }
}
