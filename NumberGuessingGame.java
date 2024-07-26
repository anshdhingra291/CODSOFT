import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the maximum number for the range: ");
        int maxNumber = scanner.nextInt();

        int selectedNumber = random.nextInt(maxNumber) + 1;

        System.out.println("A number has been selected between 1 and " + maxNumber + ". Try to guess it!");

        int userGuess = 0;
        int attempts = 0;

        
        while (userGuess != selectedNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < selectedNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > selectedNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
