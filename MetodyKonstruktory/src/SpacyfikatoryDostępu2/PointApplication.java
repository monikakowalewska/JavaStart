package SpacyfikatoryDost�pu2;

import SpecyfikatoryDost�pu.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p=new Point(15,17);
        PointController pc=new PointController();
        pc.addX(p);
        System.out.println("Po zwi�kszeniu x= "+p.getX());
    }
}
