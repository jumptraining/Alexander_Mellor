import java.lang.Math;
public class Main {
	private static byte getRandomNum() {
		// Function that returns either a 1 or a 2
		int coinInt = (int)Math.floor(Math.random() * 2) + 1;
		byte coinByte = (byte)coinInt;
		return coinByte;
	}
	public static void main(String[] args) {
		int tally[] = new int[2]; // Initializes an integer array of size 2
		tally[0] = 0;	// Initializes array index 0 with an integer value 0
		tally[1] = 0;	// Initializes array index 1 with an integer value 0
		System.out.println("1000 Coin Flips.");
		for(int i = 0; i < 1000; i++) {	// Loops 1000 times 
			double coinFlip = getRandomNum();
			if(coinFlip == 1) {	// Checks if value equals 1 and increments the correct array value 
				tally[0]++;
			}else if(coinFlip == 2) {	// Checks if value equals 2 and increments the correct array value
				tally[1]++;
			}
		}
		System.out.println("Count of Head: " + tally[0]);
		System.out.println("Count of Tail: " + tally[1]);
	}
}
