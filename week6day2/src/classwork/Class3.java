package classwork;

public class Class3 implements Class1, Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class3 objClass3 = new Class3();
		objClass3.displayinfo1();
		objClass3.displayinfo2();
	}

	@Override
	public void displayinfo2() {
System.out.println("This is method displayinfo2");		
	}

	@Override
	public void displayinfo1() {
System.out.println("This is method displayinfo1");

	}

}
