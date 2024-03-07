import java.util.Scanner; // used for Scanner

// public class name has to be the same as file name
public class GuessingGame
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

    // static final means only one instance of the variable is made no matter how 
    // many objects are created and the value of that variable can never change
    private static final int MIN_NUM = 1; // is the lower bound of range
    
    // linear way of guessing
    void linear(int maxNum) {
        // loop through range
        for (int i = MIN_NUM; i <= maxNum; i++)
	    {
            // ask if the current number is your number
	        System.out.println("Is your number " + i + "?");
	        String s = sc.next();
	        
            // if number is found then print prompt and return
	        if (s.equals("yes")) {
	            System.out.println("Found your number");
	            return;
	        }
	    }

        // number not found
        System.out.println("Number not found");
    }
    
    // logarithmic way of guessing
    void binary(int high) {
        // holds the lower change
        int low = MIN_NUM;
        
        // loop until low becomes bigger than high
        while (low <= high) {
            // calculate the middle number of the range
            int mid = low + (high - low) / 2;
            
            // ask if the current mid number is your number
            System.out.println("Is your number " + mid + "?");
            String s = sc.next();
            
            // if number is found then print promt and return
            if (s.equals("yes")) {
                System.out.println("Found your number");
                return;
            }
            
            // ask if number is less than or greater than the mid number
            System.out.println("Is your number less than or greater than " + mid + "?");
            s = sc.next();
            
            // if less, then change range so that we check the lower half
            if (s.equals("less")) {
                high = mid - 1;
            }
            // if greater, then change range so that we check the upper half
            else if (s.equals("greater")) {
                low = mid + 1;
            }
        }

        // number not found
        System.out.println("Number not found");
    }
    
	public static void main(String[] args) {
	    System.out.println("Guessing Game:");
        
        // holds the biggest number in the range
	    int maxNum;

        System.out.print("Insert upper bound of range: ");
        maxNum = sc.nextInt();

	    GuessingGame game = new GuessingGame();

        // guessing the number using the linear and binary approach
	    game.linear(maxNum);
	    System.out.println();
	    System.out.println();
	    game.binary(maxNum);

	    sc.close();
	}
}
