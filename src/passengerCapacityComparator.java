import java.util.Comparator;

public class passengerCapacityComparator implements Comparator<Boat> {
    @Override
    public int compare(Boat o1, Boat o2){
        return o1.getPassengerCapacity() - o2.getPassengerCapacity();
    }
}
