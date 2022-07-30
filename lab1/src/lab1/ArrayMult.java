package lab1;

public class ArrayMult {
	
	public int[] mult(int[] array1, int[] array2) {
		
		// Variables
		int minLen;
		int maxLen;
		int[] shortArray;
		int[] longArray;
		int[] outArray;
		
		// Find short/long arrays.
		if(array1.length <= array2.length) {
			minLen = array1.length;
			maxLen = array2.length;
			shortArray = array1;
			longArray = array2;
		}
		else {
			minLen = array2.length;
			maxLen = array1.length;
			shortArray = array2;
			longArray = array1;
		}
		
		// Initialize outArray
		outArray = new int[maxLen];

		// Compute point-wise multiplication
		for(int i = 0; i < minLen; i++) {
			outArray[i] = shortArray[i] * longArray[i];
		}
		
		// Fill remaining positions with longArray values
		for(int i = minLen; i < maxLen; i++) {
			outArray[i] = longArray[i];
		}
		
		// Return outArray
		return outArray;
		
	}
	
	

}
