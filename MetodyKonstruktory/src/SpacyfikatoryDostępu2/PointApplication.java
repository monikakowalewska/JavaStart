package SpacyfikatoryDostępu2;

import SpecyfikatoryDostępu.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p=new Point(15,17);
        PointController pc=new PointController();
        pc.addX(p);
        System.out.println("Po zwiększeniu x= "+p.getX());
    }
}
