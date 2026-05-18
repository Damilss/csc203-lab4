import java.util.Comparator;

public class BoatPassengerCapacityComparator implements Comparator<Boat> {
    
    public BoatPassengerCapacityComparator(){}

    @Override
    public int compare(Boat o1, Boat o2){
        return o1.getPassengerCapacity() - o2.getPassengerCapacity();
    }
}
