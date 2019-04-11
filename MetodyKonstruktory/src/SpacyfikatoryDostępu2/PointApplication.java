package SpacyfikatoryDostêpu2;

import SpecyfikatoryDostêpu.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p=new Point(15,17);
        PointController pc=new PointController();
        pc.addX(p);
        System.out.println("Po zwiêkszeniu x, wspó³rzêdne punktu to "+p.getX()+" "+p.getY());
        pc.minusX(p);
        System.out.println("Po zmniejszeniu x, wspó³rzêdne punktu to "+p.getX()+" "+p.getY());
        pc.addY(p);
        System.out.println("Po zwiêkszeniu y, wspó³rzêdne punktu to "+p.getX()+" "+p.getY());
        pc.minusY(p);
        System.out.println("Po zmniejszeniu y, wspó³rzêdne punktu to "+p.getX()+" "+p.getY());
    }
}
