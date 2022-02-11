package com.projonboarding.questionone;

public class AscendingNumbers {

	public static boolean ascendingCheck(String number) {
		int numberLength = number.length();
		
		for (int i = 0; i < (numberLength/2); i++) {
			// Setup a temp variable to hold the substring from the first number all the way to the last
			// and then make that string into an integer
			String temp = number.substring(0, i + 1);
			int n = Integer.parseInt(temp);
			
			// While the length of the temp variable is less than the number that was input, concatenate
			// n on to the end of temp after incrementing it to the next number, thus creating an ascending
			// number that we can then use to check if our input string matches (and if it does match, then
			// the input string was ascending and it returns true)
			while (temp.length() < numberLength) {
				n++;
				temp = temp + n;
			}
			
			
			if (temp.equals(number)) {
				return true;
			}
		}
		
		// If the method doesn't reach the if statement that will return true, it will automatically return false at the end
		return false;
	}
	
}
