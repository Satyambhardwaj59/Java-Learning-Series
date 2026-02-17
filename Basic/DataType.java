package Basics;

public class DataType {

	public static void main(String[] args) {
		
		// byte -> store 1 byte of integer data , -128 to 127 , if i apply any arithmetic operations on this it will be converted into int
		byte a = 20;
		byte b = 30;
		
		int sum = a+b;
		
		
		System.out.println("a + b " + sum);
		
		// short -> store 2 byte of integer data , -32,768 to 32,767 , if i apply any arithmetic operations on this it will be converted into int
		short c = 35;
		short d = 45;
		int e = c + d;
		
		System.out.println("c + d " + e);
		 
		
		// int -> store 4 byte of integer data ,
		int f = 46;
		int g = 44;
		
		int h = f + g;
		
		System.out.println("f + g " + h);
		
		// long -> store 8 byte of integer data
		
		long num = 100;
		System.out.println("num " + num);
		
		// float -> size 4 bytes , store 2 floating point number (default all floating point number is double , to convert into float use f) 
		float pai = 3.14f;
		System.out.println("pai " + pai);
		
		// double -> size 8 bytes, store 15 floating point number
		double doub = 15.12345455;
		System.out.println("doub " + doub);
		
		
		// char -> size 2 byte, store single character 'A'
		char s = 'S';
		System.out.println("s " + s);
		
		// boolean -> size 1 byte , store only true/false
		
		boolean isLogedIn = false;
		System.out.println("isLogedIn: " + isLogedIn);
		
		
		//      Data Type Conversion 
		// Implicit type conversion -> Implicit type conversion (also called Widening Conversion) is when Java automatically converts a smaller data type into a larger data type without explicit casting. It is lossless
		
		short data = 20;
		
		int bigData = data;
		
		
		// Explicit type conversion -> Explicit type casting (also called Narrowing Conversion) is when a larger data type is converted into a smaller data type manually using casting. It will be lossy 
		// Explicit type casting is used when converting a larger data type into a smaller one. It requires manual casting and may result in data loss or overflow, so it should be used carefully.
		
		short number = 150;
		 
		byte shortNum = (byte) number;
		
		System.out.println("shortNum: " + shortNum);  // -106
		
		long count = 200;
		
		int count2 = (int)count; // type casting
		System.out.println("count2: " + count2); // 200 
		
	}

}
