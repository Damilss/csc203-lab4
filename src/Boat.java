public class Boat implements Comparable<Boat> {
    private BoatTypes type;
    private int length;
    private int passengerCapacity;

    public Boat(BoatTypes type, int length, int passengerCapacity){
        this.type = type;
        this.length = length;
        this.passengerCapacity = passengerCapacity;
    }

    //get methods
    public BoatTypes getType(){ return this.type; }

    public int getLength(){ return this.length; }

    public int getPassengerCapacity(){ return this.passengerCapacity; }

    //set methods

    protected void setType(BoatTypes type){ this.type = type; }

    protected void setLength(int length){ this.length = length; }

    protected void setPassengerCapacity(int newCapacity){ this.passengerCapacity = newCapacity; }

    @Override
    public int compareTo(Boat other){
        return this.length - other.length;
    }





}
