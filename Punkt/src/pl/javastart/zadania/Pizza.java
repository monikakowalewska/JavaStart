package pl.javastart.zadania;

public enum Pizza {
MARGHERITA (true,true, false, false),
CAPRICIOSA (true, true, true, false), 
PROSCIUTTO (true, true, false, true);
	private String description;
	private boolean sos_pomidorowy;
	private boolean ser;
	private boolean pieczarki;
	private boolean szynka;
	
	public  boolean isSos_pomidorowy() {
		return sos_pomidorowy;
	}
	public void setSos_pomidorowy(boolean sos_pomidorowy) {
		this.sos_pomidorowy = sos_pomidorowy;
	}
	public boolean isSer() {
		return ser;
	}
	public void setSer(boolean ser) {
		this.ser = ser;
	}
	public boolean isPieczarki() {
		return pieczarki;
	}
	public void setPieczarki(boolean pieczarki) {
		this.pieczarki = pieczarki;
	}
	public boolean isSzynka() {
		return szynka;
	}
	public void setSzynka(boolean szynka) {
		this.szynka = szynka;
	}
	
	//konstruktor??
	
	Pizza (boolean sos,boolean ser, boolean pieczar,boolean szyn){
		this.setSos_pomidorowy(sos);
		this.setSer(ser);
		this.setPieczarki(pieczar);
		this.setSzynka(szyn);
	}
	
	public void pokazSkladniki(Pizza pizza)
	{
	if(sos_pomidorowy==true){
		System.out.println("sos pomidorowy");
	}
	if(ser==true){
		System.out.println("ser");
	}
	if(pieczarki==true){
		System.out.println("pieczarki");
	}
	if(szynka==true){
		System.out.println("szynka");
	}
		}
		
	
	/*Pizza(String desc) {
		description = desc;
	}*/
	/*public String getDescription() {
		
		return description;
	}
	*/
	@Override
	public String toString(){
		//przypisanie nazwy pizzy
				String result = this.name() + "(";
				//informacja o sk³adnikach
				if(sos_pomidorowy) {
					result = result + "sos pomidorowy";
				}
				if(ser) {
					result = result + ", ser";
				}
				if(pieczarki) {
					result = result + ", pieczarki";
				}
				if(szynka) {
					result = result + ", szynka";
				}
				result = result + ")";
				
				return result;
			}

	
	
}
