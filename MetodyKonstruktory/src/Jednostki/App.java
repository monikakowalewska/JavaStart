package Jednostki;

public class App {
    public static void main(String[] args) {
        LengthUnit lu=new LengthUnit();
        System.out.println("Zamie� 15.3 metr�w na centymetry "+lu.metrNaCent(15.3));
        System.out.println("Zamie� 100045.9 milimetr�w na metry "+lu.miliNaMetr(100045.9));
        System.out.println("Zamie� 3.5 centymetr�w na milimetry "+lu.metrNaMili(lu.centNaMetr(3.5)));
        TimeUnit tu=new TimeUnit();
        System.out.println("Zamie� 14 godz na minuty "+tu.godzNaMinuty(14.0));
        System.out.println("Zamie� 16 godz na milisekundy "+
                tu.sekNaMilisek(tu.minutyNaSek(tu.godzNaMinuty(16))));
    }
}
