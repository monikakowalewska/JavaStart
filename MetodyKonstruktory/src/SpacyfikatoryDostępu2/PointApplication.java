package SpacyfikatoryDost�pu2;

import SpecyfikatoryDost�pu.Point;

public class PointApplication {
    public static final int ADD_X = 1;
    public static final int MINUS_X = 2;
    public static final int ADD_Y = 3;
    public static final int MINUS_Y = 4;
    public static void main(String[] args) {

        Point p=new Point(15,17);
        System.out.println("Punkt przed zmian�: (" + p.getX()+";"+p.getY()+")");

        PointController pc=new PointController();
        int option=3;
        switch (option) {
            case ADD_X:
                pc.addX(p);
                System.out.println("Po zwi�kszeniu x, wsp�rz�dne punktu to " + p.getX() + " " + p.getY());
                break;
            case MINUS_X:
                pc.minusX(p);
                System.out.println("Po zmniejszeniu x, wsp�rz�dne punktu to " + p.getX() + " " + p.getY());
                break;
            case ADD_Y:
                pc.addY(p);
                System.out.println("Po zwi�kszeniu y, wsp�rz�dne punktu to " + p.getX() + " " + p.getY());
                break;
            case MINUS_Y:
                pc.minusY(p);
                System.out.println("Po zmniejszeniu y, wsp�rz�dne punktu to " + p.getX() + " " + p.getY());
                break;
                default:
                    System.out.println("Nie wykonano �ednej operacji.");
        }
        System.out.println("Punkt po zmianie: (" + p.getX()+";"+p.getY()+")");

    }
}

