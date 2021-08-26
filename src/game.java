import java.util.Scanner;

public class game {

    public static void GameLoop(char[] movieTitle)
    {
        int wrongGuess = 0;
        int cntRightGuess = 0;
        int cntMatch = 0;
        int cntSpace = 0;
        char[] wrongGuesses = new char[20];
        char userInput = '0';
        boolean winLos = false;
        char[] enteredName = new char[movieTitle.length];

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("You are guessing:");
            for (int i = 0; i < movieTitle.length; i++) {
                if (movieTitle[i] != ' ') {
                    enteredName[i] = '_';
                } else {
                    enteredName[i] = ' ';
                    cntSpace++;
                }
                System.out.print(enteredName[i]);
            }
            System.out.print("\n");

            while (!winLos) {

                System.out.print("The number of wrong letter you Guessed: " + wrongGuess + "\n");
                for (int i = 0; wrongGuesses[i] != '\0'; i++) {
                    System.out.print(wrongGuesses[i] + " ");
                }
                System.out.println();

                System.out.print("Guess a letter of the movie: ");


                userInput = scan.next().charAt(0);

                for (int i = 0; i < movieTitle.length; i++) {
                    if (userInput == movieTitle[i]) {
                        if (enteredName[i] != movieTitle[i])
                            cntMatch++;
                        enteredName[i] = movieTitle[i];

                    }
                }
                if (cntMatch == 0) {
                    wrongGuesses[wrongGuess] = userInput;
                    wrongGuess++;
                } else {
                    cntRightGuess += cntMatch;
                }

                if (wrongGuess >= 10) {
                    System.out.println("You have Lost");
                    break;
                }
                if (cntRightGuess + cntSpace == movieTitle.length) {
                    System.out.println("You win!");
                    System.out.println("You have guessed '" + String.valueOf(movieTitle) + "' correctly");
                    break;
                }

                System.out.print("You are guessing:");
                cntMatch = 0;
                for (int i = 0; i < movieTitle.length; i++) {
                    System.out.print(enteredName[i]);
                }
                System.out.print("\n");
            }
        }
    }
}
