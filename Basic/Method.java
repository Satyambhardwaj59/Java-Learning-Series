package Basics;
import java.util.*;

public class Method {
	
	public static void printHelloWorld() {
		System.out.println("Hello World! How are you");
		System.out.println("Hello World! How are you");
		System.out.println("Hello World! How are you");
		return;
	}
	
	public static void calculateSum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum is: "+ sum);
		return;
	}
	
	public static int sumOf2(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a is: "+ a);
		System.out.println("b is: "+ b);
		
		return;
		
	}
	
	public static int multiplication(int a, int b) {
		
		int multi = a * b;
		
		return multi;
		
	}
	
	public static int factorial(int n) {
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		return fact;
		
	}
	
	public static void binomialCoefficient(int n, int r) {
		
		int fact_n = factorial(n);
		int fact_r = factorial(r);
		int fact_nMr = factorial(n - r);
		
		int biaCoeff = fact_n / (fact_r * fact_nMr);
		
		System.out.println("Binomial Coefficient = "+ biaCoeff);
		
	}

	public static void main(String[] args) {
		
//		printHelloWorld();
		
//		int a = 20;
//		int b = 23;
//		
//		calculateSum(a, b);
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter a: ");
//		int a = sc.nextInt();
//		System.out.print("Enter b: ");
//		int b = sc.nextInt();
		
//		calculateSum(a, b);
		
//		int sum = sumOf2(a, b);
		
		
//		System.out.println("Sum is: "+ sum);
		
//		System.out.println("Sum is: "+ sumOf2(a, b));
		
		int a = 20;
		int b = 10;
		
//		swap(a, b);
		
//		int multi = multiplication(a, b);
		
//		System.out.println("Multiplication is: "+ multi);
		
//		System.out.println("factorial is: "+ factorial(6));
		
		
		binomialCoefficient(5, 2);
		

	}

}
