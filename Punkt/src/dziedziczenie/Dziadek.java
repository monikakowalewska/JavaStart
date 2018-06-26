package dziedziczenie;

public class Dziadek extends Emeryt{
	public String pseudonim;
	public int wiek;
	public String hobby;
	public Dziadek (String pseudonim,int wiek, String hobby){
		this.pseudonim=pseudonim;
		this.wiek=wiek;
		this.hobby=hobby;
	};
	String getPseudonim(){return pseudonim;}
	int getWiek(){return wiek;}
	String getHobby(){return hobby;}
	/* metoda abstrakcyjna zaimplementowana w klasie Dziadek*/
	String krzyk="AAAAAAAAAAa";
	public String krzyczNaDzieci(){
		System.out.println("A wy znowu ha³asujecie!");
//		System.out.println(krzyk);
		return krzyk;
	};
	/*wykorzystanie zaimplementowanej metody*/
	public void biegnijDoSklepu(){
		super.biegnijDoSklepu(100, 2);
	}
	
	void print(){
		System.out.println("Dziadek "+pseudonim+" ma lat "+wiek+", a jego zainteresowania to "+hobby);
	}
}
