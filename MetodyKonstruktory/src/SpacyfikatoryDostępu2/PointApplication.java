package SpacyfikatoryDost�pu2;

import SpecyfikatoryDost�pu.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p=new Point(15,17);
        PointController pc=new PointController();
        pc.addX(p);
        System.out.println("Po zwi�kszeniu x, wsp�rz�dne punktu to "+p.getX()+" "+p.getY());
        pc.minusX(p);
        System.out.println("Po zmniejszeniu x, wsp�rz�dne punktu to "+p.getX()+" "+p.getY());
        pc.addY(p);
        System.out.println("Po zwi�kszeniu y, wsp�rz�dne punktu to "+p.getX()+" "+p.getY());
        pc.minusY(p);
        System.out.println("Po zmniejszeniu y, wsp�rz�dne punktu to "+p.getX()+" "+p.getY());
    }
}
