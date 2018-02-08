//
//public class Punkt 
//{
//int x,y;
//int getX()
//{return x;
//}
//int getY()
//{return y;
//}

public class Punkt
{
	int x,y;
	void ustawWspolrzedne(int wspX, int wspY)
		{
			x= wspX;
			y= wspY;
		}

void pokazWspolrzedne()
{
System.out.println("x=" + x + " y=" +y);
}

public Punkt()
{
	System.out.println("Konstruktor");
}
}