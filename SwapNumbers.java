import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b= s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The First number has been swapped to "  +a);
		System.out.println("The second number has been swapped to " +b);
				
	}
}
