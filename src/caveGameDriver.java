import java.util.Scanner;

public class caveGameDriver {

	public static void main(String[] args) {
		// Two dragon objects created, one for each cave in the game
		Dragon one = new Dragon();
		Dragon two = new Dragon();

		// runs the game setup method, sets up which dragon is evil and which isn't
		gameSetup(one, two);

		// starts the intro text for the game
		System.out.println(gameIntro());

		// User inputs being set up
		Scanner userInput = new Scanner(System.in);
		String input = "";

		// to store the ending text from the following while loop
		String ending = ""; 

		// Will loop until correct input
		while (true) {
			System.out.println("Which cave will you enter? (Enter 1 or 2)");
			input = userInput.nextLine();

			// this if-elseif-else will both check for the correct input, as well as calling
			// for the Dragon gameOutcome to
			// setup the correct ending text for the game
			if (input.equals("1")) {
				ending = one.gameOutcome();
				break;
			} else if (input.equals("2")) {
				ending = two.gameOutcome();
				break;
			} else {
				System.out.println("Incorrect input, please retry.");
			}
		}

		// prints the game results
		System.out.println(ending);

		// ties up loose Scanner ends
		userInput.close();
	}

	// gameIntro method to hold the string so it doesn't clutter main()
	public static String gameIntro() {
		return "You are in a land full of dragons. In front of you,\n"
				+ "you see two caves. In one cave, the dragon is friendly\n"
				+ "and will share his treasure with you. The other dragon is\n"
				+ "greedy and hungry and will eat you on sight.\n";
	}

	public static void gameSetup(Dragon one, Dragon two) {
		int randomNumberGenerator = (int) Math.random() % 2;
		if (randomNumberGenerator == 1) {
			one.setEvil(true);
		} else {
			two.setEvil(true);
		}
	}

}
