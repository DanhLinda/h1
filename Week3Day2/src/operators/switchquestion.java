package operators;

import java.util.Scanner;

public class switchquestion {

	public static void main(String[] args) {
	Scanner	 s = new Scanner(System.in);
		int day  = s.nextInt();
		switch(day) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tues");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thurs");
			break;
			
		default:
				System.out.println("Invalid");
			
		}
	
}
}