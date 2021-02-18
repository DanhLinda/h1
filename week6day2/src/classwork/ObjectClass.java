package classwork;

public class ObjectClass extends ClassA {
//ClassA obj = new ClassA(); 
	@Override
	public int calculateAge() {
		// TODO Auto-generated method stub
		int age =30;
		return age;
	}
	
	public static void main(String args[])
	{
		ObjectClass obj = new ObjectClass();
		System.out .println(obj.calculateAge());
	}

}
