package pl.javastart.zadania02;

import pl.javastart.zadania.Point;

public class PointController {
	
	

int addX(int x){
	x=x+1;
	return x;
}
int minusX(int x){
	x=x-1;
	return x;
}
int addY(int y){
	y+=1;
	return y;
}
int minusY(int y){
	y-=1;
	return y;
}
//obiekt klasy Point przekazany jako parametr funkcji, dziêki temu zmieniasz wartoœæ pól obiektu
public void addX(Point p) {
	p.setX(p.getX() + 1);
}

public void minusX(Point p) {
	p.setX(p.getX() - 1);
}

public void addY(Point p) {
	p.setY(p.getY() + 1);
}

public void minusY(Point p) {
	p.setY(p.getY() - 1);
}
//dodatkowa metoda
public void changeObject(Point p) {
	p = new Point(-100, -100);
}
public static final int ADD_X = 1;
public static final int ADD_Y=2;
public static final int MINUS_X=3;
public static final int MINUS_Y=4;
}
