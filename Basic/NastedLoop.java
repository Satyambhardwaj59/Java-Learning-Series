package Basics;

public class NastedLoop {

	public static void main(String[] args) {
		
		
		// Write 10 times 1 - 5;
		
//		for(int i = 0; i <= 10; i++) {
//			for(int j = 1; j <= 5; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 0; i <= 18; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		
//		
//		for(int i = 0; i <= 10; i++) {
//			int j = 0;
//		while( j <= 5 ) {
//			if(j == 3) break;
//			System.out.print(j + " ");
//			j++;
//		}
//		System.out.println();
//	}
		
		
		outerLoop: 

			for(int i = 0; i <= 10; i++) {
				int j = 0;
			while( j <= 5 ) {
				if(j == 3) break outerLoop;
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
		}
		

	}

}
