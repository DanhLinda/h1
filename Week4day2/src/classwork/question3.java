package classwork;

public class question3 {

	public static void main(String[] args) {
		//3.	Loop through that array and sum the numbers 1-10, then print that total to the screen.
	
		int sum=0;
		int [] numbers = new int [5];
		numbers [0]= 10;
		numbers [1]= 20;
		numbers [2]= 3;
		numbers [3]= 4;
		numbers [4]= 5;
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
			//0+10=10
			//10+20=30
		}
		System.out.println("sum "+sum);
		
}
}