package homework;

/*What is polymorphism?
	 * Polymorphism is a feature that allows performing a single action in different ways.

What is Method Overriding and Method Overloading?
	Method overloading is a feature that allows a class to have more than one method that shares the same name but the 
arguments can vary such as different number of parameters in an argument list, difference in data type of parameters, 
or sequence of data type of arguments.
	Method overridding is very specific. the argument list or classes need to be the same as the overridden method. return type needs to be the same as the orginal method in superclass. 
the access level can't be more restrictive than its overridden method's access level. the method must be inherited to be overridden. 

Advantage of polymorphism?

The advantages of polymorphism are being able to call the same method name but performing different actions
	 * when called or providing the same action with different data types

*/
	public class Question3{

		public static void main(String[] args) {
			//For returning Float Types
			Day1Problem3 obj = new Day1Problem3();
			
			//Case 1
			System.out.println("Case 1: " + myMethod(5, 4, 6.2f));
			System.out.println("Case 1: " + myMethod(5, 4, 6.5f));
			//Case 2 
			System.out.println("Case 2: " + myMethod(5, 10));
			System.out.println("Case 2: " + myMethod(5.0f, 10.0f));
			//Case 3
			System.out.println("Case 3: " + myMethod(5, 10));
			System.out.println("Case 3: " + myMethod(45));
			//Case 4 
			System.out.println("Case 4: " + obj.myMethod(5, 10.0f));
			System.out.println("Case 4: " + obj.myMethod(5.0f, 10));
			//Case 5
			System.out.println("Case 5: " + myMethod(5, 10));
			System.out.println("Case 5: " + obj.myMethod(5, 10));

		}
		//Methods return Integer Types
		public static int myMethod(int a) {
			return a;
		}
		
		public static int myMethod(int a, int b) {
			int c = a + b;
			return c;
		}
		
		public static int myMethod(int a, float b) {
			int c = a + Math.round(b);
			return c;
		}
		
		public static int myMethod(float a, int b) {
			int c = Math.round(a) + b;
			return c;
		}
		
		public static int myMethod(float a, float b) {
			int c = Math.round(a) + Math.round(b);
			return c;
		}
		
		public static int myMethod(int a, int b, float c) {
			int d = a + b + Math.round(c);
			return d;
		}

	}