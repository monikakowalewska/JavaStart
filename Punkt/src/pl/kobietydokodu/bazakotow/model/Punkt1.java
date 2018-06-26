package pl.kobietydokodu.bazakotow.model;

public class Punkt1 {
	int x;
	int y;
	static void zwieksz(Punkt1 punkt){
		punkt.x++;
		}
	static void zmien(Punkt1 punkt){
		punkt.y+=2;}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	static void print(Punkt1 punkt){
		System.out.println("Wyœwietlam wspó³rzêdne punktu "+punkt.x+", "+punkt.y);
	}
	}

