import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(20)+1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What number between 1 and 20 am I thinking of?");
		String input = scan.next();
		int guess = Integer.parseInt(input);
		
		while(guess != number) {
			if (guess > number) {
				System.out.println("Too high! Try again!");
			} else {System.out.println("Too low! Try again!");
			}
			input = scan.next();
			guess = Integer.parseInt(input);
		}
		
		System.out.println("You guessed correctly!");
		
		scan.close();
	}
}
