package homework;

public class CalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer Methods
				System.out.println("Add Int: " + add(2,8));
				System.out.println("Sub Int: " + sub(2,8));
				System.out.println("Div Int: " + div(2,8));
				System.out.println("Mult Int: " + mult(2,8));
				
				System.out.println("------------------------------");
				//Long Methods
				System.out.println("Add Long: " + add(123456,1234567));
				System.out.println("Sub Long: " + sub(123456,1234567));
				System.out.println("Div Long: " + div(12345678,12345678));
				System.out.println("Mult Long: " + mult(12345678,12345678));
			}

			
			static public int add(int a, int b) {
				int c = a + b;
				return c;
			}
			
			static public int sub(int a, int b) {
				int c = a - b;
				return c;
			}
			
			static public int div(int a, int b) {
				int c = a / b;
				return c;
			}
			
			static public int mult(int a, int b) {
				int c = a * b;
				return c;
			}
			
			static public long add(long a, long b) {
				long c = a + b;
				return c;
			}
			
			static public long sub(long a, long b) {
				long c = a - b;
				return c;
			}
			
			static public long div(long a, long b) {
				long c = a / b;
				return c;
			}
			
			static public long mult(long a, long b) {
				long c = a * b;
				return c;
			}
		}


