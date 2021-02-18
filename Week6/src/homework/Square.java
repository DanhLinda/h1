package homework;

	public class Square implements Shape{
		
		public void draw() {
			System.out.println("Drawing Square");
		}

		public static void main(String[] args) {
			Square obj = new Square();
			obj.draw();
		}

	}

