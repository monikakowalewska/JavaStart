
public class Punkt3D extends Punkt2D{
	int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	public Punkt3D(){
		x=0;
		y=0;
		z=0;
	}
	public Punkt3D(int x, int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void print(){
		System.out.println("Wyœwietlam wspó³rzêdne punktu w 3D "+x+" "+y+" "+z);
	}

}
