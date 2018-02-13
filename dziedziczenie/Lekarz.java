package dziedziczenie;

public class Lekarz extends Pracownik{
	private double premia;
	private String specjalizacja;
	 
    public Lekarz(String imie, String nazwisko, double wyplata, String specjalizacja) {
    	super(imie, nazwisko, wyplata);
    	  premia = 0;
    	  
      
    }
 
    public double getPremia(){ return premia; }
    public void setPremia(double d){
        premia = d;}
        public void setSpecjalizacja(String S){
        	specjalizacja=S;
        }
       public void print(){
    	   super.print();
        System.out.println("Premia "+premia+" Specjalizacja "+specjalizacja);	
        }
    
}
