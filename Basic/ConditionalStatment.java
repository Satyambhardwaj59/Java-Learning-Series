package Basics;

public class ConditionalStatment {

	public static void main(String[] args) {
//		int age = 4;
		
//		int age = 24;
//		
//		if(age >= 18) {
//			System.out.println("You can vote!!");
//		} else {
//			System.out.println("You cann't vote!!!");
//		}
		
		
//		int day = 4;
//		
//		boolean sl = false;
//		
//		if(day == 1 || day == 7) {
//			System.out.println("Go to home and enjoy!!!");
//		} else if(day == 3) {
//			System.out.println("Work from home !!!");
//		} else if(day == 4){
//			if (sl) {
//				System.out.println("Stay home and take rest");
//			} else {
//				System.out.println("Go office !!!");
//			}
//			
//		}
		
		
//		int a = 8;
//		int b = 2;
//		int c = 6;
//		
//		
//		if(a > b) {
//			System.out.println("A is bigger then b");
//			if(a > c) {
//				System.out.println("A is bigger then c");
//				System.out.println("A is largest "+ a);
//			} else {
//				System.out.println("c is bigger then a");
//				System.out.println("c is largest " + c);
//			}
//		} else {
//			System.out.println("b is bigger then a");
//			if (b > c) {
//				System.out.println("b is bigger then c");
//				System.out.println("b is largest " +b);
//			} else {
//				System.out.println("c is bigger then a");
//				System.out.println("c is largest "+ c);
//			}
//		}
		
		
//		int a = 8;
//		int b = 2;
//		int c = 6;
//		int d = 10;
//		int largest;
//		
//		 if (a > b) {
//	            if (a > c) {
//	                if (a > d) {
//	                    largest = a;
//	                } else {
//	                    largest = d;
//	                }
//	            } else {
//	                if (c > d) {
//	                    largest = c;
//	                } else {
//	                    largest = d;
//	                }
//	            }
//	        } else {
//	        	if (b > c) {
//                if (b > d) {
//                    largest = b;
//                } else {
//                    largest = d;
//                }
//            } else {
//                if (c > d) {
//                    largest = c;
//                } else {
//                    largest = d;
//                }
//            }
//        }
//		 
//		 
//		 System.out.println("Largest number is: " + largest);
		
		
		
		
		/*    Ternary operator      */
		
		int a = 123;
		int b = 304;
		int c = 54;
		int max;
		
		max = a>b ? a>c ? a : c : b>c ? b : c;
		
		System.out.println("Max is: "+ max);
		

	}

}
