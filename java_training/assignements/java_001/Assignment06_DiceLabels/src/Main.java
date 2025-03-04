
public class Main {
	public static void main(String[] args) {
		byte loopControl = 7;
		String diceRoll[][] = {
				{"", "1\t\t", "2\t", "3\t\t", "4\t", "5\t\t", "6"},
				{"1", "Snake Eyes\t", "Astrailian Yo", "Little Jo From Kokomo", "No Field Five", "Easy Six\t", "Six One You're Done"},
				{"2", "Ace Caught A Duece", "Ballarena", "The Fever\t", "Jimmie Hicks", "Benny Blue\t", "Easy Eight"},
				{"3", "Easy Four\t", "OJ\t", "Brooklen Forest\t", "Big Red", "Eighter From Decatur\t", "Nina From Pasadena"},
				{"4", "Little Phoebe\t", "Easy Six", "Skinny McKinney\t", "Square Pair", "Railroad Nine\t", "Big One On The End"},
				{"5", "Sixie From Dixie", "Skinny Dugan", "Easy Eight\t", "Jessie James", "Puppy Paws\t", "Yo"},
				{"6", "The Devil\t", "Easy Eight", "Lou Brown\t", "Tennessee", "Six Five No Jive", "Midnight"}
		};
		System.out.println("Dice Combination Label Matrix");
		for(byte x = 0; x < loopControl; x++) {
			for(byte y = 0; y < loopControl; y++) {
				System.out.print(diceRoll[x][y]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}
