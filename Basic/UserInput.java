package Basics;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your input: ");
		// int a = sc.nextInt();
		//System.out.println("a: " + a);
		
//		float b = sc.nextFloat();
//		System.out.println("b: " + b);
		
//		String s = sc.next();
//		
//		System.out.println("Hello " + s + "!!!!");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a + b: " + (a+b));

		sc.close();

	}

}
