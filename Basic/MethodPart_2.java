package Basics;

public class MethodPart_2 {
	
	
	// **********************************     function overloading =>  **************************
	
	// using parameter 
	
//	public static int sum(int a, int b) {
//		return a + b;
//	}
	
	public static int sum(int a, int b, int c) {
		return a + b +c;
	}
	
	
	// using data type 
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static float sum(float a, float b) {
		return a + b ;
	}
	
	
	//******************************** check prime Number ***********************
	
	
//	public static boolean isPrime(int n) {
//		if (n == 2) {
//			return true;
//		}
//		
//		for(int i = 2; i <= (n - 1); i++) {
//			if(n % i == 0) {
//				return true;
//			}
//		}
//		
//		return false;
//		
//	}
	
	
	// optimize way 
	
	public static boolean isPrime(int n) {
		
		if (n < 2) {
			return false;
		}
		
		if (n == 2) {
			return true;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void printPrime(int n) {
		if (n == 2) {
			System.out.println("2");
		}
		
//		System.out.println("Hello");
		
		for(int i = 2; i <= n; i++) {
			
//			boolean prime = isPrime(i);
			
//			if(!prime) {
//				System.out.println(i);
//			}
			
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
	}
	
	
//	public static void printFactor(int n) {
//		if (n == 2) {
//			System.out.println("2");
//		}
//		
//		for(int i = 2; i <= (n - 1); i++) {
//			if(n % i == 0) {
//				System.out.println(i);
//			}
//		}
//		
//		return;
//	}
	
	
	
	// ***************  Binary to decimal **********************
	
	
	public static void binToDec(int binNum) {
		
		int myNum = binNum;
		int pow = 0;
		int decNum = 0;
		
		while (binNum > 0) {
			
			int lastDigit = binNum % 10; 
			
			decNum = decNum + (lastDigit * (int)Math.pow(2,  pow) );
			
			pow++;
			
			binNum = binNum/10;
			
			
		}
		
		System.out.println("Decimal of "+ myNum + " is "+ decNum);
		
		
	}
	
	
	public static void decToBin(int num) {
		int myNum = num;
		int pow = 0;
		int binNum = 0; 
		
		
		while(num > 0) {
			int rem = num % 2;
			
			binNum = binNum + (rem * (int)Math.pow(10, pow));
			
			pow++;
			num = num/2;
			
			
		}
		
		System.out.println("Binary of "+ myNum + " is "+ binNum);
	}
	
	

	public static void main(String[] args) {
		
//	System.out.println(sum(2, 6));	
//		System.out.println(sum(2, 4, 6));
		
//		System.out.println(sum(2, 6));	
//		System.out.println(sum(2.0f, 6.0f));
		
//		System.out.println(isPrime(57));
		
//		printFactor(24);
		
//		printPrime(100);
		
//		binToDec(1111);
		decToBin(8);

	}

}
