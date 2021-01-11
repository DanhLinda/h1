package homework;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
//get three numbers from user and print the largest among three numbers
		
		System.out.println("Enter 3 numbers and print the largest");
		Scanner user = new Scanner (System.in);

		int n1 = user.nextInt(); 
		int n2 = user.nextInt();
		int n3 = user.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			
			System.out.println("n1 is the largest of the three numbers"); 
			}
		
		else if (n2 > n1 && n2 > n3) {
	
		System.out.println("n2 is the largest of the three numbers"); 
		    }
	
		else {
	
		System.out.println("n3 is the largest of the three numbers"); 
		}
	
	}
} 