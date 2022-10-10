
import java.util.Random;
import java.util.Scanner;

public class MP1 {
	public static void main(String[] args) {
		Random random = new Random();

		while (true) {

			System.out.println("Guess a number between 1-100");
			int Guesses = 0;
			int ranNum = random.nextInt(101);
			int Guess = -1;
			Scanner scanner = new Scanner(System.in);

			
			while (!checkNumber(Guess, ranNum)) {

				try {
					Guess = scanner.nextInt();
				} catch (Exception e) {
					System.out.println("Endast heltal!");
					scanner.next();
					continue;
				}

				if (Guess < ranNum) {
					System.out.println("Higher");
				} else if (Guess > ranNum) {
					System.out.println("Lower");
				}
				Guesses++;

			}

			
			if (Guesses == 1) {
				System.out.println("First try");
			} else {
				System.out.println(" Winner! ");
				System.out.println("You took " + Guesses + " guesses!");
			}

			// Spela igen eller avsluta spelet
			System.out.println("   ");
			System.out.println("Type Play to play again");
			scanner.nextLine();
			String input = scanner.nextLine();
			if (!input.equals("Play")) {
				break;
				
			}
		}

		System.out.println("Game Ended");
		 
	}

	static boolean checkNumber(int talet, int randomNumber) {
		return talet == randomNumber;
	}

}




