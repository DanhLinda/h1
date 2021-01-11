package operators;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	 s = new Scanner(System.in);
		int day  = s.nextInt();
		
		if(day==1)
		{
			System.out.println("mon");
		}
		if(day==2)
		{
			System.out.println("tues");
		}
		if(day==3)
		{
			System.out.println("wed");
		}
		if(day==4)
		{
			System.out.println("thurs");
		}
		else
		{
			System.out.println("Invalid");
		}

		
	}

}
