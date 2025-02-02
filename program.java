import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempt = 10;
        int rounds = 0;
        int score = 0;
        System.out.println("Hi everyone!!!Let's play a simple game.");
        System.out.println("Welcome to the NUMBER GUESSING GAME.");
        while (true)
        {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            System.out.println("Are you ready? Shall we start the game.");
            System.out.println("Round " + (rounds + 1) + ":");
            System.out.println("You want to choose a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
            while (attempts < maxAttempt) 
            {
                System.out.print("Enter your guessed number: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == targetNumber)
                {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } 
                else if (userGuess < targetNumber)
                {
                    System.out.println("Your guess is too low. Try again.");
                } 
                else
                {
                    System.out.println("Your guess is too high. Try again.");
                }
                if (attempts == maxAttempt)
                {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
                }
            }
            System.out.print("Do you want to play another round with us? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes"))
            {
                System.out.println("Thanks for playing! Your total score is: " + score + " out of " + (rounds + 1) + " rounds won.");
                break;
            }
            rounds++;
        }
        scanner.close();
    }
}
