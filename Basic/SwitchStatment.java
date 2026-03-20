package Basics;

import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the day number: ");
		
		int day = sc.nextInt();
		
		switch(day){
		 	
		case 1:
			System.out.println("Today is Sunday");
			break;
		case 2:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Weadnesday");
			break;
		case 5:
			System.out.println("Today is Thrusday");
			break;
		case 6:
			System.out.println("Today is Fryday");
			break;
		case 7:
			System.out.println("Today is Sutearday");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
