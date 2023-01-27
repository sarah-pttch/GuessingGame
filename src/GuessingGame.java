import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(20)+1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What number between 1 and 20 am I thinking of?");
		int guess = Integer.parseInt(scan.next());
		
		while(guess != number) {
			if (guess > number) {
				System.out.println("Too high! Try again!");
			} else {System.out.println("Too low! Try again!");
			}
			guess = Integer.parseInt(scan.next());
		}
		
		System.out.println("You guessed correctly!");
		
		scan.close();
	}
}
