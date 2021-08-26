import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class FileReader {
    public static String arr[] = new String[100];

    static String ReadAndScanFile() throws FileNotFoundException {
        File file = new File("MovieTitles.txt");
        Scanner scan = new Scanner(file);
        int i = 0;
        while(scan.hasNextLine()) {
            arr[i] = scan.nextLine();
            i++;
        }
        int indexNumber = TakeRandomIndex(i);

        return arr[indexNumber];
    }

    static int TakeRandomIndex(int range){
        Random dice = new Random();
        int number = dice.nextInt(range);
        return number;
    }
}
