
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

        System.out.println("Boat.compareTo() TESTS");

        check("longer boat is positive", checkresult1 );
        check("shorter boat is negative", checkresult2);
        check("boat lengths are equal", checkresult3);

        System.out.println("result1= " + checkresult1);
        System.out.println("result2= " + checkresult2);
        System.out.println("result3= " + checkresult3);
        
        /**
         * generate a comparate instancs so that we can use .compare() method
         */
        BoatTypeComparator typeComparator = new BoatTypeComparator();

        System.out.println("BoatTypeComparator TESTS");

        int result4 = typeComparator.compare(titanic, tugBoat);
        int result5 = typeComparator.compare(disneyShip, titanic);
        int result6 = typeComparator.compare(yacht, tugBoat);

        boolean checkresult4 = result4 > 0;
        boolean checkresult5 = result5 == 0;
        boolean checkresult6 = result6 < 0;

        check("Boat type, titanic compared to tugBoat is positive", checkresult4 );
        check("Boat type, Titanic and disneyShips are both cruise, so equal.", checkresult5);
        check("Boat type, yacht compared to workboat is negative.", checkresult6);

        System.out.println("result4= " + checkresult4);
        System.out.println("result5= " + checkresult5);
        System.out.println("result6= " + checkresult6);

        System.out.println("BoatTypeComparator TESTS");

        System.out.println("Passed tests, " + getPassed() + " | Failed Tests, " + getFailed());
    }
}
