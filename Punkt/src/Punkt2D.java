
public class Punkt2D {
	int x;
	int y;
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
	
	public Punkt2D(){
		x=0;
		y=0;
	}
	public Punkt2D(int a, int b){
		x=a;
		y=b;
	}
//metody
	public void print(){
		System.out.println("Wy�wietlam wsp�rz�dne punktu w 2D "+x+" "+y);
	}
}
