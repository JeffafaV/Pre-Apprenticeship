import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThrowException {
    static Scanner sc = new Scanner(System.in);
    
    public static void isValidFirst(String f) throws Exception {
        if (f.equals("Jeff")) {
            throw new Exception("No Jeff's allowed!!!");
        }
    }
    
    public static void isValidLast(String l) throws Exception {
        if (l.equals("Smith")) {
            throw new Exception("No Smith's allowed!!!");
        }
    }
    
    public static void isValidAge(int a) throws Exception {
        if (a < 18) {
            throw new Exception("No minors allowed!!!");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Error log program (check file for errors)");
        
        // Specify the output file path
        String outputPath = "ErrorLog.txt";

        try {
            FileWriter fileWriter = new FileWriter(outputPath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            System.out.print("Enter first name: ");
            String firstName = sc.next();
            System.out.print("Enter last name: ");
            String lastName = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            
            try {
                isValidFirst(firstName);
            }
            catch (Exception e) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
            
            try {
                isValidLast(lastName);
            }
            catch (Exception e) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
            
            try {
                isValidAge(age);
            }
            catch (Exception e) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
            
            bufferedWriter.close();
        } catch (IOException e) {
            
        }
        
    }
}
