import java.util.Comparator;

public class BoatTypeComparator implements Comparator<Boat>{
    
    @Override
    public int compare(Boat o1, Boat o2){
        return o1.compareTo(o2);
    }

}
