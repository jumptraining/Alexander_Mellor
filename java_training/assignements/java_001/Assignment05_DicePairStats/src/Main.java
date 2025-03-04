import java.lang.Math;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
	private static byte roll6SidedDie() {
		// Function that returns a number between 1 and 6 to simulate a 6 sided die roll
		int test = (int)Math.floor(Math.random() * 6) + 1;
		byte roll = (byte)test;
		return roll;
	}
	public static void main(String[] args) {
		Map<String,Integer> tally = new HashMap<String, Integer>();	// Initializes a map between a string key and an int value
		double dice1;
		double dice2;
		// Sets the default values for the map
		tally.put("Double 1's", 0);
		tally.put("1 and 2", 0);
		tally.put("1 and 3", 0);
		tally.put("1 and 4", 0);
		tally.put("1 and 5", 0);
		tally.put("1 and 6", 0);
		tally.put("Double 2's", 0);
		tally.put("2 and 3", 0);
		tally.put("2 and 4", 0);
		tally.put("2 and 5", 0);
		tally.put("2 and 6", 0);
		tally.put("Double 3's", 0);
		tally.put("3 and 4", 0);
		tally.put("3 and 5", 0);
		tally.put("3 and 6", 0);
		tally.put("Double 4's", 0);
		tally.put("4 and 5", 0);
		tally.put("4 and 6", 0);
		tally.put("Double 5's", 0);
		tally.put("5 and 6", 0);
		tally.put("Double 6's", 0);
		for(int x = 0; x < 1000; x++) {
			// Rolls 2 die 1000 times and tallies all combinations
			dice1 = roll6SidedDie();
			dice2 = roll6SidedDie();
			if(dice1 == 1 && dice2 ==1) {
				// Double 1's
				tally.put("Double 1's", (tally.get("Double 1's") + 1));
			}else if((dice1 == 1 && dice2 == 2) || (dice1 == 2 && dice2 == 1)) {
				// Rolled a 1 and a 2
				tally.put("1 and 2", (tally.get("1 and 2") + 1));
			}else if((dice1 == 1 && dice2 == 3) || (dice1 == 3 && dice2 == 1)) {
				// Rolled a 1 and a 3
				tally.put("1 and 3", (tally.get("1 and 3") + 1));
			}else if((dice1 == 1 && dice2 == 4) || (dice1 == 4 && dice2 == 1)) {
				// Rolled a 1 and a 4
				tally.put("1 and 4", (tally.get("1 and 4") + 1));
			}else if((dice1 == 1 && dice2 == 5) || (dice1 == 5 && dice2 == 1)) {
				// Rolled a 1 and a 5
				tally.put("1 and 5", (tally.get("1 and 5") + 1));
			}else if((dice1 == 1 && dice2 == 6) || (dice1 == 6 && dice2 == 1)) {
				// Rolled a 1 and a 6
				tally.put("1 and 6", (tally.get("1 and 6") + 1));
			}else if(dice1 == 2 && dice2 == 2) {
				// Double 2's
				tally.put("Double 2's", (tally.get("Double 2's") + 1));
			}else if((dice1 == 2 && dice2 == 3) || (dice1 == 3 && dice2 == 2)) {
				// Rolled a 2 and a 3
				tally.put("2 and 3", (tally.get("2 and 3") + 1));
			}else if((dice1 == 2 && dice2 == 4) || (dice1 == 4 && dice2 == 2)) {
				// Rolled a 2 and a 4
				tally.put("2 and 4", (tally.get("2 and 4") + 1));
			}else if((dice1 == 2 && dice2 == 5) || (dice1 == 5 && dice2 == 2)) {
				// Rolled a 2 and a 5
				tally.put("2 and 5", (tally.get("2 and 5") + 1));
			}else if((dice1 == 2 && dice2 == 6) || (dice1 == 6 && dice2 == 2)) {
				// Rolled a 2 and a 6
				tally.put("2 and 6", (tally.get("2 and 6") + 1));
			}else if(dice1 == 3 && dice2 == 3) {
				// Double 3's
				tally.put("Double 3's", (tally.get("Double 3's") + 1));
			}else if((dice1 == 3 && dice2 == 4) || (dice1 == 4 && dice2 == 3)) {
				// Rolled a 3 and a 4
				tally.put("3 and 4", (tally.get("3 and 4") + 1));
			}else if((dice1 == 3 && dice2 == 5) || (dice1 == 5 && dice2 == 3)) {
				// Rolled a 3 and a 5
				tally.put("3 and 5", (tally.get("3 and 5") + 1));
			}else if((dice1 == 3 && dice2 == 6) || (dice1 == 6 && dice2 == 3)) {
				// Rolled a 3 and a 6
				tally.put("3 and 6", (tally.get("3 and 6") + 1));
			}else if(dice1 == 4 && dice2 == 4) {
				// Double 4's
				tally.put("Double 4's", (tally.get("Double 4's") + 1));
			}else if((dice1 == 4 && dice2 == 5) || (dice1 == 5 && dice2 == 4)) {
				// Rolled a 4 and a 5
				tally.put("4 and 5", (tally.get("4 and 5") + 1));
			}else if((dice1 == 4 && dice2 == 6) || (dice1 == 6 && dice2 == 4)) {
				// Rolled a 4 and a 6
				tally.put("4 and 6", (tally.get("4 and 6") + 1));
			}else if(dice1 == 5 && dice2 == 5) {
				// Double 5's
				tally.put("Double 5's", (tally.get("Double 5's") + 1));
			}else if((dice1 == 5 && dice2 == 6) || (dice1 == 6 && dice2 == 5)) {
				// Rolled a 5 and a 6
				tally.put("5 and 6", (tally.get("5 and 6") + 1));
			}else if(dice1 == 6 && dice2 == 6) {
				// Double 6's
				tally.put("Double 6's", (tally.get("Double 6's") + 1));
			}
		}
		/*
		 * Sorts the occurrences of dice rolls from most to least using maps
		 * Algorithm developed by Lokesh Gupta at HowToDoInJava
		 */
		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		tally.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
		// Outputs the results to the user
		System.out.println("1000 Random 2 Dice Toss Stats:");
	    Iterator it = reverseSortedMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println("Rolled " + pair.getKey() + ": " + pair.getValue() + " times");
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}
}
