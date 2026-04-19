package Basics;

public class Arrays {

	public static void main(String[] args) {
		
	//	int[] intArray; 		//   decleration of array
//		 int arr[];
		 
//		 arr = new int[20];   // allocation 
		 
		
		
		int arr[] = new int[5];
		
		 arr[0] = 5;
		 arr[1] = 2;
		 arr[2] = 6;
		
		 
//		 System.out.println(arr[0]);
//		 System.out.println(arr[1]);
//		 System.out.println(arr[2]);
//		 System.out.println(arr[3]);
		 
//		 System.out.println(arr.length);
		 
		 
		 
//		 int marks[] = {78, 98, 65, 65};
		 
//		 System.out.println(marks[0]);
//		 System.out.println(marks[1]);
//		 System.out.println(marks[2]);
//		 System.out.println(marks[3]);
//		 System.out.println(marks[6]);     out of bound
		 
		 
		 String names[] = {"Ram", "Shyam", "Sonu", "Arth"};
		 
//		 for (int i = 0; i < names.length; i ++) {
//			 System.out.println("Name is: "+ names[i]);
//		 }
		 
		 
//		 for(String name: names) {
//			 System.out.println("from for each Name is: "+ name);
//		 }
		
		 
		 
		 int numbers[] = {23, 12, 6, 7, 23, 67};
		 
//		 int sum = 0;
//		 
//		 for(int num: numbers) {
//			 sum += num;
//		 }
//		
//		 System.out.println("sum is: "+ sum);
		 
		 
//		 int min = Integer.MAX_VALUE;
//		 
//		 for(int num: numbers) {
//			 if(num < min) {
//				 
//				 min = num;
//				 System.out.println("current min is: "+ min);
//			 }
//		 }
//		 
//		 System.out.println("Minimum is: "+ min);
		 
		 
		 
int max = Integer.MIN_VALUE;
		 
//		 for(int num: numbers) {
//			 if(num > max) {
//				 
//				 max = num;
//				 System.out.println("current max is: "+ max);
//			 }
//		 }
//		 
//		 System.out.println("Mmaximum is: "+ max);
		 
		 

// **************************  2D Array  *******************

//		int marks[][] = new int[4][3];
//		
//		marks[0][0] =  12;
//		marks[0][1] =  98;
//		marks[0][2] =  34;
//		
//		marks[1][0] =  34;
//		marks[1][1] =  45;
//		marks[1][2] =  56;
//		
//		marks[2][0] =  54;
//		marks[2][1] =  34;
//		marks[2][2] =  66;
//		
//		marks[3][0] =  12;
//		marks[3][1] =  98;
//		marks[3][2] =  34;


		int marks[][] = {
				{12, 98, 34},
				{34, 45, 56},
				{54, 34, 66},
				{12, 98, 34}
		};
		
		System.out.println("Marks is: "+ marks[2][1]);
		 
		 
	}

}
