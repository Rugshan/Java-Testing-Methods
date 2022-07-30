package lab2;

import java.util.*;

public class RE {
	
	public static boolean checkPhoneNumber(String s) {
		//return s.matches("(\d{3}) \d{3} - \d{4}"); // Fault
		return s.matches(" *\\(\\d{3}\\) *\\d{3} *\\- *\\d{4} *"); // Solution
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a phone number: ");
		String input = sc.nextLine();
		sc.close(); // Close Scanner
		
		boolean wasPhoneNum = checkPhoneNumber(input);
		System.out.println("\nThat was" + (wasPhoneNum? "" : "n't" + " a phone number."));
		
	}
	

}
