import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the number guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

        while (guess != targetNumber) {

            System.out.println("Please enter the valid number!!!");
            scanner.next();
            continue;   
        }
        guess = scanner.nextInt();
        attempts++;

        if (guess < targetNumber) {
            System.out.println("You are tooo low!! Try Again");
        } else if (guess > targetNumber){
            System.out.println("You are too High!! Try Again");
        } else {
            System.out.println("You found the numebr Congratulation!!!!");
        }
    }
}
