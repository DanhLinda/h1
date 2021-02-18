package homework;

public class ClassB {
	
	static int a = 50;
	static int b = 100;
	
	static public void display() {
		System.out.println("Class B" + (a + b));
	}
	public static void main(String[] args) {
		//calling display from within class
		display(); //displays ClassB method
		
		//creating object and displaying both classes
		ClassA obj1 = new ClassA();
		ClassB obj2 = new ClassB();
		
		obj1.display(); //displays ClassA method
		obj2.display(); //displays ClassB method
		
	}

}
