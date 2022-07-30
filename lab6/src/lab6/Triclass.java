package lab6;

public class Triclass {
	
	// Classify the triangle given three side lengths.
	public static String classify(int x, int y, int z) {
		
		// INVALID CLASSIFICATIONS
		// -----------------------
		
		// Lengths must be between 1 to 10 (inclusive)
		if (x < 1 || y < 1 || z < 1 || x > 10 || y > 10 || z > 10) {
			return "not a triangle";
		}
		// Invalid if sum of two sides are less than third side.
		else if (((x + y) <= z) || ((x + z) <= y) || ((y + z) <= x)) {
			return "not a triangle";
		}
		
		// VALID CLASSIFICATIONS
		// ---------------------
		
		if (x == y && x == z) {
			return "equilateral";
		}
		else if ((x != y) && (x != z) && (y != z)) {
			return "scalene";
		}
		else if (x == y || x == z || y == z) {
			return "isosceles";
		}
		
		// Other
		return "not a triangle";
		
	}
	
	

}
