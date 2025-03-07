import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Nah !!! TOO LOW!, Try again");
            }
            else if(guess > randomNumber){
                System.out.println("NOPE !! TOO HIGH!, Try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("You took " + attempts + " attempts to guess.");
            }

        }while(guess != randomNumber);

        scanner.close();
    }
