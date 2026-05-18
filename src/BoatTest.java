
public class BoatTest {

    /**
     * This class is used for all test cases regarding boat.
     */
    private static int passed = 0; 
    private static int failed = 0;

    static void check(String name, boolean condition){
        if (condition){passed++;} else { failed++; }
    }

    public static int getPassed(){ return passed; }

    public static int getFailed(){ return failed; }

    

    public static void main(String[] args){
        /**
         * testing compare to for
         */
        Boat titanic = new Boat(BoatTypes.CRUISE, 200, 2000);
        Boat disneyShip = new Boat(BoatTypes.CRUISE, 150, 1500);
        Boat tugBoat = new Boat(BoatTypes.WORK_BOAT, 20, 5);
        Boat yacht = new Boat(BoatTypes.YACHT, 20, 10);
        
        int result1 = titanic.compareTo(tugBoat);
        int result2 = disneyShip.compareTo(titanic);
        int result3 = yacht.compareTo(tugBoat);

        boolean checkresult1 = result1 > 0;
        boolean checkresult2 = result2 < 0;
        boolean checkresult3 = result3 == 0;

        check("longer boat is positive", checkresult1 );
        check("shorter boat is negative", checkresult2);
        check("boat lengths are equal", checkresult3);

        System.out.println("Passed tests, " + getPassed() + " | Failed Tests, " + getFailed());
        System.out.println("result1= " + checkresult1);
        System.out.println("result2= " + checkresult2);
        System.out.println("result3= " + checkresult3);

        
    }
}
