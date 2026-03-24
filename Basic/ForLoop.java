package Basics;

import java.util.*;

public class Loops {

	public static void main(String[] args) {
		
//		for(int i = 0; i <= 20; i++ ) {
//			System.out.println(i);
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		// Table of given number 
		
//		for(int i = 1; i <= 10; i++ ) {
//		System.out.println(n + " * " + i + " = "+ n*i);
//	}
		
		// sum of first natural number 
//		int sum = 0; 
//		for(int i = 1; i<=n; i ++) {
//			sum += i;
//		}
//		
//		System.out.println("Sum of first "+ n + " number = "+ sum);
		
		// sum of first even natural number 
		int sum = 0; 
		for(int i = 1; i<=n; i ++) {
			sum += i*2;
		}
		
		System.out.println("Sum of first "+ n + " even natural number = "+ sum);
	}

}
