package homework;

public class Q3 {

	public static void main(String[] args) {
//3.	Print the numbers 1 to 20 but skip the number whose remainder is zero if divided by 5.


		for (int j=1; j<=20; j++)
		{
		if (j % 5 == 0) 
		{
			continue;
		}
			System.out.println(j);	
		}
		}
}