package homework;


public class Circle implements Shape {
		
		public void draw() {
			
			System.out.println("Drawing Circle");
		}

		public static void main(String[] args) {
			Circle obj = new Circle();
			obj.draw();
		}

	}

