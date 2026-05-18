

public class Main {
    public void main(String[] args){
        Boat titanic = new Boat("Cruise", 200, 2000);

        Boat disneyShip = new Boat("Cruise", 150, 1500);

        Boat tugBoat = new Boat("Work Boat", 20, 5);

        Boat yacht = new Boat("Personal Lesuire", 20, 10);
        
        int result1 = titanic.compareTo(tugBoat);
        
        int result2 = disneyShip.compareTo(titanic);

        int result3 = yacht.compareTo(tugBoat);


        System.out.println("result1 = testing titanic.compareTo(tugBoat);");
        System.out.println("Expected result: Positive number");
        System.out.printf("result: ", result1);
        System.out.println();

        System.out.println("result2 = testing disneyShip.compareTo(titanic);");
        System.out.println("Expected Result: negavtive number");
        System.out.printf("Result: ", result2);
        System.out.println();

        System.out.println("result3 = testing yacht.compareTo(tugBoat)");
        System.out.println("expected result: 0");
        System.out.printf("result: ", result3);
        System.out.println();
    }
}
