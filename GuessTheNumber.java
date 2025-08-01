import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess = 0;
        int tries = 0;

        System.out.println("Guess the number (1 to 100):");

        while(guess != number) {
            System.out.print("Enter guess: ");
            guess = sc.nextInt();
            tries++;

            if(guess < number) {
                System.out.println("Too low!");
            } else if(guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + tries + " tries.");
            }
        }

        sc.close();
    }
}
