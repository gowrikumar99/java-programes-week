import java.util.Random;
import java.util.Scanner;

class NumberGuessingCondition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        boolean guessedCorrectly = false;
        int numberOfGuesses = 0;

        while (!guessedCorrectly) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
                System.out.print("Do you want to play again? (y/n): ");
                String playAgain = scanner.next();

                if (playAgain.equalsIgnoreCase("y")) {
                    numberToGuess = random.nextInt(100) + 1;
                    guessedCorrectly = false;
                    numberOfGuesses = 0;
                } else {
                    guessedCorrectly = true;
                }
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Guess again.");
            } else {
                System.out.println("Your guess is too high. Guess again.");
            }
        }

        scanner.close();
    }
}