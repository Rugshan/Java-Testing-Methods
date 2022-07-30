package lab1;

public class ArrayShift {

	public int[] shiftOne(int[] inArray) {
	
		// Get array size.
		int sizeArray;
		sizeArray = inArray.length;
		
		// Create outArray and initialize element 0.
		int[] outArray = new int[sizeArray];
		outArray[0] = -1;
		
		// Perform shift operation.
		for(int i = 1; i < sizeArray; i++) {
			outArray[i] = inArray[i-1];
		}
		
		// Return result.
		return outArray;
		
	}
	
}
