import java.util.Scanner;

public class GuessGame
{
    /*
        just some notes on static and Scanner
        when creating a static anything, only one instance is created for 
        the class, meaning no matter how many objects are created there will
        only be one instace of that thing.
        the scanner has a close method which frees up the resource. However, 
        closing that scanner will also close the source. Meaning that if you 
        close a scanner that has System.in, then you will close System.in and 
        you won't be able to reopen it with another scanner. Also, you should 
        only have one scanner per input source. Furthermore, after reading 
        online it seems that its okay to just not close the scanner for  
        System.in or you can but do it at the very end of the program.
    */
    private static Scanner sc = new Scanner(System.in);
    
    void linear() {
        for (int i = 1; i <= 20; i++)
	    {
	        System.out.println("Is your number " + i + "?");
	        String s = sc.next();
	        
	        if (s.equals("yes")) {
	            System.out.println("Found your number");
	            return;
	        }
	    }
    }
    
    void binary() {
        int low = 1;
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
	    // insert as argument for both methods
	    int maxNum;
	    GuessGame game = new GuessGame();
	    game.linear();
	    System.out.println();
	    System.out.println();
	    game.binary();
	    sc.close();
	}
}
