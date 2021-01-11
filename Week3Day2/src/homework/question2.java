package homework;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
/*calculator app Design a calculator app where user enters the two numbers and ask the operation user 
		wants to perform on it like addition, subtraction, division and multiplication.
		(use classes, objects and decision-making logic to write this app)*/
		
		Scanner calculator = new Scanner (System.in);
		
		double num1;
		double num2;
		double answer;
		int operator; 
		System.out.println("Enter first number:");
		num1 = calculator.nextDouble();
		System.out.println("Enter second number:");
		num2 = calculator.nextDouble();
		System.out.println("input operation: 1 = addition, 2 = subtraction, 3 = multiplication, 4 = division");
		operator = calculator.nextInt();
		
		switch (operator) { 
		case 1:
			answer = num1 + num2;
			System.out.println("Your answer is " + answer); 
			break;
		case 2:
			answer = num1 - num2;
			System.out.println("Your answer is " + answer); 
			break;
		case 3:
			answer = num1 * num2;
			System.out.println("Your answer is " + answer); 
			break;
		case 4:
			answer = num1 / num2;
			System.out.println("Your answer is " + answer); 
			break;
		default: 
			System.out.println("invalid");
		}
		
	}
	
	

}
