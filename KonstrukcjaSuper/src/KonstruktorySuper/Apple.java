package KonstruktorySuper;

public class Apple extends Fruit {
    public String odmiana;

    public String getOdmiana() {
        return odmiana;
    }

    public void setOdmiana(String odmiana) {
        this.odmiana = odmiana;
    }

    public Apple(String odmiana){
//       super(); - niejawne wywo³anie
        this.odmiana=odmiana;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jab³ko "+getOdmiana());
    }
}
