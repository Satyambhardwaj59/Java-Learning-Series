package Array;
import java.util.*;

public class TwoDArray {
	
	public static void printArray(int matrix[][]) {
		for(int i = 0; i< matrix.length; i++) {
			for(int j =0; j< matrix[0].length; j++) {
				
				 System.out.print(matrix[i][j] + " ");
			}
		}
		
		System.out.println();
	}
	
	
	public static void search(int matrix[][], int key) {
		for(int i = 0; i< matrix.length; i++) {
			for(int j =0; j< matrix[0].length; j++) {
				
				if(matrix[i][j] == key) {
					System.out.print("Number found at: ("+ i + ","+ j + ")");
					return;
				}
				
			}
		}
		
		System.out.println("Number not found");
		return;
	}

	public static void main(String[] args) {
		
		int matrix[][] = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for search: ");
		int key = sc.nextInt();
		
		System.out.println("Enter the number in matrix");
		for(int i = 0; i< matrix.length; i++) {
			for(int j =0; j< matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
				 System.out.print(" ");
			}
		}
		
//		printArray(matrix);
		
		search(matrix, key);
	}

}
