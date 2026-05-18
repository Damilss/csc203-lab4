import java.util.Comparator;

public class BoatLengthComparator implements Comparator<Boat> {
    
    public BoatLengthComparator(){}

    @Override
    public int compare(Boat o1, Boat o2){
        return o1.compareTo(o2);
    }
}
