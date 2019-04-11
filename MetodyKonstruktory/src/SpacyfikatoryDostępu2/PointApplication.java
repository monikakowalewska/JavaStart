package SpacyfikatoryDostêpu2;

import SpecyfikatoryDostêpu.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p=new Point(15,17);
        PointController pc=new PointController();
        pc.addX(p);
        System.out.println("Po zwiêkszeniu x= "+p.getX());
    }
}
