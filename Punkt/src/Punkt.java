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
Punkt pobierzWspolrzedne()
{
	Punkt punkt = new Punkt();
	punkt.x = x;
	punkt.y=y;
	return punkt;
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