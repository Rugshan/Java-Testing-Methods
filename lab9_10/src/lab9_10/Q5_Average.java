package lab9_10;

public class Q5_Average {
	
	public static int average(int[] v) {
		
		if (v == null || v.length == 0)
			throw new IllegalArgumentException();
		
		int r = 0;
		
		for (int i = 0; i < v.length; i++) {
			r = r + v[i];
		}
		
		r = r / v.length;
		
		return r;
	}

}
