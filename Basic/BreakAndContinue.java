package Basics;

public class BreakAndContinue {

	public static void main(String[] args) {
	
//		for(int i = 0; i <=20; i +=2) {
//			System.out.println(i);
//			if(i >= 12) break;
//		}
		
//		int i = 0;
//		
//		while(i <= 5) {
//			System.out.println(i);
//			i++;
//			if(i >= 4) break;
//		}
		
		
		// Continue
		
		for(int i = 0; i <=20; i +=2) {
			if(i == 12 || i == 8) continue;
			System.out.println(i);
		
	}

	}

}
