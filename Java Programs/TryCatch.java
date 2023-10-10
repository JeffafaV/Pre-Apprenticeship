public class TryCatch
{
    static void printThird(int[] a) {
        try {
            System.out.println(a[2]);
        }
        catch (Exception e) {
            System.out.println("Array doesn't have a third element");
        }
    }
    
    static void divideByZero(int a, int b) {
        try {
            System.out.println(a/b);
        }
        catch (Exception e) {
            System.out.println("Can't divide by 0");
        }
    }
	public static void main(String[] args) {
		int[] arr = {1, 2};
		int a = 5;
		int b = 0;
		
		printThird(arr);
		divideByZero(a, b);
	}
}
