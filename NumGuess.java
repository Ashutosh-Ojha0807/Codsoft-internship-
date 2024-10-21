import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;
        int userGuess;

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            userGuess = scanner.nextInt();

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}
