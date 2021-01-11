package homework;

import java.util.Scanner;

public class division {

	public static void main(String[] args) {
		/*calculator app Design a calculator app where user enters the two numbers and ask the operation user 
						wants to perform on it like addition, subtraction, division and multiplication.
						(use classes, objects and decision-making logic to write this app)*/
						
			Scanner calculator = new Scanner (System.in);
						
						double num1;
						double num2;
						double answer;
						System.out.println("Enter first number:");
						num1 = calculator.nextDouble();
						System.out.println("Enter second number:");
						num2 = calculator.nextDouble();
					answer = num1 / num2;
					System.out.println("Your answer is " + answer);
					}
					
		
	}


