package Susmilich;
import java.util.Comparator;
public class ComparatorZavodnikByName implements Comparator<Zavodnik> {

    @Override
    public int compare(Zavodnik o1, Zavodnik o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
    
}
