package ciekaweKlasy;

public class Bubble {
public static void main(String[] args) {
	
	Sortable s=new Sortable() {
		@Override
		public int[]sort(int[] tab) {
			// TODO Auto-generated method stub
			if (tab == null || tab.length == 0)
			return tab;
			for (int i = 0; i < tab.length; i++) {
		        for (int j = 0; j < tab.length - 1; j++) {
		            if (tab[j] > tab[j + 1]) {
		                int temp;
		                temp = tab[j + 1];
		                tab[j + 1] = tab[j];
		                tab[j] = temp;
		            }
		        }
			}
		        return tab;
		}
	};
	int[] tab = { 5, 10, -8, -23, 1009, 2938, 153, 24 };
	tab=s.sort(tab);
	for(int i=0;i<tab.length;i++)
	System.out.println("i="+i+" wartoœæ= "+tab[i]);
	
	}
	


}
