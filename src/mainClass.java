import java.io.FileNotFoundException;

public class mainClass {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the game of Guess the Movie!");
        System.out.println("The rules are simple, the computer randomly picks a movie title, and shows you how many letters its made up of.");
        System.out.println("Your goal is to try to figure out the movie by guessing one letter at a time.");
        System.out.println("If a letter is indeed in the title the computer will reveal its correct position in the word, if not, you lose a point.");
        System.out.println("If you lose 10 points, game over!!");
        System.out.println("Let's start!");
        String selectedMovie = FileReader.ReadAndScanFile();
        char[] movieName = selectedMovie.toCharArray();
        game.GameLoop(movieName);
    }
}
