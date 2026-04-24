package Array;

public class PairsInArray {
	
	public static void pairsInArray(int numbers[]) {
		
		int totalPair = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			int curr = numbers[i];
			
			for(int j = i+1; j < numbers.length; j++) {
				System.out.print("("+ curr + ", " + numbers[j] + ")");
				totalPair++;
			}
			System.out.println();
		}
		
		System.out.println("Total pair is: "+ totalPair);
	}

	public static void main(String[] args) {
		int numbers[] = {2, 4, 6, 8, 10};
		pairsInArray(numbers);

	}

}
