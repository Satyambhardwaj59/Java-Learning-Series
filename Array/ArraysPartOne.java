package Basics;
import java.util.*;

public class ArraysPartOne {
	
	private static final String Interger = null;

	// array work on call by reference
	public static void updateArray(int numbers[]) {
		for(int i =0; i < numbers.length; i++) {
			numbers[i] = numbers[i] + 1;
		}
		
		return;
	}
	
	// linear search 
	
	public static int linearSearch(int numbers[], int key) {
		
		for(int i =0; i < numbers.length; i++) {
			if(numbers[i] == key) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public static int findLargestNumber(int numbers[]) {
		
		int largest = Integer.MIN_VALUE;
		
		for(int i =0; i < numbers.length; i++) {
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		
		return largest;
	}
	
	
	public static int findSmallestNumber(int numbers[]) {
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i =0; i < numbers.length; i++) {
			if(numbers[i] < smallest ) {
				smallest  = numbers[i];
			}
		}
		
		return smallest;
	}
	
	
	public static int binarySearch(int numbers[], int key) {
		
		int start = 0, end = numbers.length - 1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if (numbers[mid] == key) {
				return mid;
			}
			
			if (numbers[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		// creating an array => 
		
//		int marks[] = new int[5];
		
//		int marks[] = { 75, 45, 78, 89,29, 80, 90 };
//		
//		for(int mark: marks) {
//			System.out.print(mark+ " ");
//		}
//		
//		System.out.println();
		
		
//		int numbers[] = new int[4];
//		
//		// input output of array
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number of array: ");
//		numbers[0] = sc.nextInt();
//		numbers[1] = sc.nextInt();
//		numbers[2] = sc.nextInt();
//		numbers[3] = sc.nextInt();
//		
//		System.out.print("Number is: ");
//		for(int num: numbers) {
//			System.out.print( num+ " ");
//		}
//		
//		System.out.println();System.out.println();
		
		
		// update of array
//		int numbers[] = { 1, 2, 4, 7, 23, 56, 64 };
		
//		numbers[2] = 5;
//		
//		System.out.println(numbers[2]);
		
//		updateArray(numbers);
//		
//		for(int num: numbers) {
//			System.out.print( num+ " ");
//		}
//		
//		System.out.println();
		
		
		int numbers[] = { 2, 4, 6, 7, 8, 12, 13, 15, 16, 20, 34, 45, 52};
		int key = 12;
		
//		System.out.println(linearSearch(numbers, key));
		
//		System.out.println(findLargestNumber(numbers));
		
//		System.out.println(findSmallestNumber(numbers));
		
		System.out.println(binarySearch(numbers, key));
		
	}

}
