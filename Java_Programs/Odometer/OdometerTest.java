import java.util.Scanner;

public class OdometerTest
{
    static Scanner sc = new Scanner(System.in);
    
    public static void addTrip(Odometer car) {
        System.out.print("Enter distance of trip: ");
        double distance = sc.nextDouble();
        car.addDistance(distance);
        
        System.out.print("Enter mpg of vehicle: ");
        double mpg = sc.nextDouble();
        car.setMpg(mpg);
        car.addFuelUsed(distance);
    }
    
    
    public static void main(String[] args) {
        Odometer car = new Odometer();
        
        System.out.println("Odometer Program");
        
        boolean b = true;
        while (b == true)
        {
            System.out.println("Enter 1 to add trip");
            System.out.println("Enter 2 to view odometer");
            System.out.println("Enter 3 to reset odometer");
            System.out.println("Enter 4 to exit");
            int choice = sc.nextInt();
            
            switch (choice)
            {
                case 1:
                    addTrip(car);
                    break;
                    
                case 2:
                    System.out.println("Fuel: " + car.getFuel());
                    System.out.println("Distance: " + car.getDistance());
                    
                    break;
                    
                case 3:
                    car.resetOdo();
                    break;
                    
                default:
                    b = false;
            }
        }
    }
}