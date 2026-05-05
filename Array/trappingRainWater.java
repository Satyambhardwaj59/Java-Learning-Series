package Array;

public class trappingRainWater {
	
	
	public static int trappingRainWater(int height[]) {
		
		int h = height.length;
		
		// calculating left max 
		
		int leftMax[] = new int[h];
		
		leftMax[0] = height[0];
		
		for (int i = 1; i < h; i++) {
			leftMax[i] = Math.max(height[i], leftMax[i -1]);
		}
		
		// calculating right max
		int rightMax[] = new int[h];
		
		rightMax[h-1] = height[h-1];
		
		for(int i = h-2; i >= 0; i--) {
			rightMax[i] = Math.max(height[i], rightMax[i+1]);
		}
		
		//  loop 
		
		int trappedWater = 0;
		
		for(int i = 0; i < h; i ++) {
			// water level
			int waterLavel = Math.min(leftMax[i], rightMax[i]);
			
			// traped water 
			 trappedWater += waterLavel - height[i];
		}
		
		return trappedWater;
	}
	

	public static void main(String[] args) {
		
		int height[] = {4, 2, 0, 6, 3, 2, 5};
		
		System.err.println(trappingRainWater(height));
		

	}

}
