//numberGussing game
import java.util.Scanner;

class NumberGuessing{
    public static void main(String[] args) {
        //Random rand = new Random();
        //int numberToGuess = rand.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        int guess=input.nextInt();
        boolean correct = false;

        while (!correct) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number!");
                correct = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }
    }
}
