import java.util.Scanner;

public class GuessGame
{
    static Scanner sc = new Scanner(System.in);
    
    static void linear() {
        for (int i = 0; i < 20; i++)
	    {
	        System.out.println("Is your number " + i + "?");
	        String s = sc.next();
	        
	        if (s.equals("yes")) {
	            System.out.println("Found your number");
	            return;
	        }
	    }
    }
    
    static void binary() {
        int low = 0;
        int high = 20;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            System.out.println("Is your number " + mid + "?");
            String s = sc.next();
            
            if (s.equals("yes")) {
                System.out.println("Found your number");
                return;
            }
            
            System.out.println("Is your number less than or greater than " + mid + "?");
            s = sc.next();
            
            if (s.equals("less")) {
                high = mid - 1;
            }
            else if (s.equals("greater")) {
                low = mid + 1;
            }
        }
    }
    
	public static void main(String[] args) {
	    linear();
	    System.out.println();
	    System.out.println();
	    binary();
	}
}
