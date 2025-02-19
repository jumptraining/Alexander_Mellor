public class Main {
	private static boolean arrayHasExactMatch(String stringArr[], String stringToCheck, boolean caseSensitive) {
		/*
		 * Takes an input String array, a String variable, and a boolean variable
		 * Boolean variable sets case sensitivity
		 * Returns True if string is found
		 */
		if(caseSensitive == true) { 	// Case sensitivity on
			for(String s : stringArr) {
				if(s.equals(stringToCheck)) {	// Checks if string is in array
					return true;
				}
			}
		}else if(caseSensitive == false) {	// Case sensitivity off
			for(String s : stringArr) {
				if(s.toLowerCase().equals(stringToCheck.toLowerCase())) {	// Checks if string is in array
					return true;
				}
			}
		}
		return false; // If string not found, returns false, otherwise true
	}
	private static int[] indexOfOccuranceInArray(String stringArr[], String stringToCheck, boolean caseSensitive) {
		/*
		 * Takes a String array, String variable, and a boolean variable
		 * Boolean variable sets case sensitivity
		 * Outputs an array of the indexes found for the String variable matches
		 * Outputs an array of length 1 with the value -1 if no matches found
		 */
		int found[];
		if(caseSensitive == true) {	// Case sensitivity on
			byte checkVal = 0;
			for(String s : stringArr) {
				if(s.contentEquals(stringToCheck)) {	// Checks if string is in array
					checkVal++;
				}
			}
			if(checkVal > 0) {	// If string is found get the index of string
				found = new int[checkVal];
				byte counter = 0;
				for(byte x = 0; x < stringArr.length; x++) {
					if(stringArr[x].contentEquals(stringToCheck)) {
						found[counter] = x;
						counter++;
					}
				}
				return found;
			}else {	// If not found, return array with 1 index with a value of -1
				found = new int[1];
				found[0] = -1;
				return found;
			}
		}else if(caseSensitive == false) {	// Case sensitivity off
			byte checkVal = 0;
			for(String s : stringArr) {
				if(s.toLowerCase().contentEquals(stringToCheck.toLowerCase())) {	// Checks if string is in array
					checkVal++;
				}
			}
			if(checkVal > 0) {	// If string is found get the index of string
				found = new int[checkVal];
				byte counter = 0;
				for(byte x = 0; x < stringArr.length; x++) {
					if(stringArr[x].toLowerCase().contentEquals(stringToCheck.toLowerCase())) {
						found[counter] = x;
						counter++;
					}
				}
				return found;
			}else {	// If not found, return array with 1 index with a value of -1
				found = new int[1];
				found[0] = -1;
				return found;
			}
		}else {	// Sets a default for code compiling
			found = new int[1];
			found[0] = -1;
			return found;
		}
	}
	public static void main(String[] args) {
		String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
		System.out.println("This is the a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items");
		System.out.print("[");
		for(byte x = 0; x < myList.length; x++) {
			System.out.print(myList[x]);
			if(x + 1 < myList.length) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		System.out.println("Senario 1");
		System.out.println("arrayHasExactMatch(myList, \"zo\", false): " + arrayHasExactMatch(myList, "zo", false));
		System.out.println("Senario 2");
		System.out.println("arrayHasExactMatch(myList, \"zoo\", false): " + arrayHasExactMatch(myList, "zoo", false));
		System.out.println("Senario 3");
		System.out.println("arrayHasExactMatch(myList, \"zoo\", true): " + arrayHasExactMatch(myList, "zoo", true));
		System.out.println("Senario 4");
		System.out.println("arrayHasExactMatch(myList, \"foo\", true): " + arrayHasExactMatch(myList, "foo", true));
		System.out.println("Senario 5");
		System.out.println("arrayHasExactMatch(myList, \"foo\", false): " + arrayHasExactMatch(myList, "foo", false));
		System.out.println("Senario 6");
		System.out.println("arrayHasExactMatch(myList, \"delta\", True): " + arrayHasExactMatch(myList, "delta", true));
		System.out.println("Senario 7");
		System.out.println("arrayHasExactMatch(myList, \"Delta\", True): " + arrayHasExactMatch(myList, "Delta", true));
		System.out.println("Senario 8");
		System.out.println("indexOfOccuranceInArray(myList, \"zo\", false): " + indexOfOccuranceInArray(myList, "zo", false)[0]);
		System.out.println("Senario 9");
		System.out.println("indexOfOccuranceInArray(myList, \"zoo\", false): " + indexOfOccuranceInArray(myList, "zoo", false)[0]);
		System.out.println("Senario 10");
		System.out.println("indexOfOccuranceInArray(myList, \"zoo\", true): " + indexOfOccuranceInArray(myList, "zoo", true)[0]);
		System.out.println("Senario 11");
		System.out.println("indexOfOccuranceInArray(myList, \"foo\", true): " + indexOfOccuranceInArray(myList, "foo", true)[0]);
		System.out.println("Senario 12");
		System.out.println("indexOfOccuranceInArray(myList, \"foo\", false): " + indexOfOccuranceInArray(myList, "foo", false)[0]);
		System.out.println("Senario 13");
		System.out.println("indexOfOccuranceInArray(myList, \"delta\", True): " + indexOfOccuranceInArray(myList, "delta", true)[0]);
		System.out.println("Senario 14");
		System.out.println("indexOfOccuranceInArray(myList, \"Delta\", True): " + indexOfOccuranceInArray(myList, "Delta", true)[0]);
	}
}