package pl.javastart.zadania;

public class Point {
int x;
private int y;

public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

private Point(){};
public Point(int x,int y){
	this.setX(x);
	this.setY(y);
}


}
