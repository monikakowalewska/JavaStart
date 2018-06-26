package dziedziczenie;
import java.util.Comparator;

public class Komparator implements Comparator<Pracownik>
{
 
    @Override
    public int compare(Pracownik p1, Pracownik p2) {
        if(p2 == null) return -1;
        if(p1.getWyplata() > p2.getWyplata()) return 1;
        else if(p1.getWyplata() < p2.getWyplata()) return -1;
        else return 0;
    }
}
