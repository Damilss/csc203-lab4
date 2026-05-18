import java.util.Comparator;

public class BoatTypeComparator implements Comparator<Boat>{

    public BoatTypeComparator(){}
    
    @Override
    public int compare(Boat o1, Boat o2){
        BoatTypes type1 = o1.getType();
        BoatTypes type2 = o2.getType();
        
        /**
         * Enums automatically implement compareTo, going based off the order the enum. similar to an array.
         * With the first item in the list being the ord 0, while the last being ord x, increasing for every 
         * item in the enum.
         */
        return type1.compareTo(type2);
    }

}
