package homework;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
//get user input, secret number is 6
		Scanner input = new Scanner (System.in); //obj to store a number for guessing
		boolean Guess = true;
		int secretNumber = 6;
		
		System.out.println("Guess a number");
		
		while (Guess) {
			int answer = input.nextInt(); //obj storing the guess
			
			if(answer == secretNumber){ //comparing the guess you stored in obj
				System.out.println("Thats correct! You win!");
				Guess = false; //End program
			}
			else{
				System.out.println("That is incorrect. Guess again");
				Guess = true; //Re-run program
			}
		}
	}

}
// need to create a class
// need to have scanner to get user input
//use while to get the secret number 6
// that is incorrect. guess again
//thats right!