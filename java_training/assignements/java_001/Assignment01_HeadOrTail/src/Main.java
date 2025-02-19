import java.lang.Math;
public class Main {
	private static byte getRandomNum() {
		// Function that returns either a 1 or a 2
		int coinInt = (int)Math.floor(Math.random() * 2) + 1;
		byte coinByte = (byte)coinInt;
		return coinByte;
	}
	private static String getCoinFlip(double randCoin) {
		// Function that checks if a double value is either a 1 or a two and returns heads or tails
		if(randCoin == 1) {
			return "Head";
		}else if(randCoin == 2){
			return "Tail";
		}else {	// Default if something other than a 1 or a 2 are input into the function 
			return "ERROR";
		}
	}
	public static void main(String[] args) {
		System.out.println("Coin Flip Program.");
		System.out.println("The Coin Flip is: " + getCoinFlip(getRandomNum()));	// Takes the getRandomNum function and inputs the value into the getCoinFlip function
	}
}
