import java.util.Random;
import java.util.Scanner;

public class random {


    public static void main(String[] args) {
        // pick a random number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast numbers between  1 to ?");
        int y = scanner.nextInt();
        System.out.println("Guess a number between 1 = " + y);
        int x = scanner.nextInt();
        Random random = new Random();
        int number = random.nextInt(y) + 1;
        System.out.println("pc number = " + number);
        System.out.println("Your Guess = " + x);
        //int
        if ( x == number) {
            System.out.println("Your Guess is correct" + number);
        }
        if (x<number){
          int between1 = number-x;
            System.out.println("Your Guess is not correct. you was" + number +"from");
        }
        if (x>number){
            int between2 = x - number;
            System.out.println("\nYour Guess is not correct. you was " + number +" from the number.");
        }
    }
}

