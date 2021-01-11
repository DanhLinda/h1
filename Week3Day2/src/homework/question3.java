package homework;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {

		System.out.println("Enter number");
		
		Scanner num = new Scanner (System.in);
		
		int num1 = num.nextInt();
		
		if (num1 %2==0) { 
			System.out.println("Even");
	
		}
		else {
			System.out.println("Odd");
		}
	}

}
