
public class Dzia³aniePunkt2DiPunkt3D {
	public static void main(String args[]){
		Punkt2D punkt1=new Punkt2D();
		punkt1.print();
		Punkt2D punkt2=new Punkt2D(3,4);
		punkt2.print();
		Punkt3D punkt3=new Punkt3D(1,2,3);
		/*System.out.println("Wspó³rzêdne punktu 2D: "+punkt2.x+" "+punkt2.y);*/
		punkt3.print();
		
		punkt3.x=5;
		punkt3.y=7;
		punkt3.z=2;
		punkt3.print();
	}
}
