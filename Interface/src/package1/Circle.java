package package1;

public class Circle implements Shapes{
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.drawShape();
		c.colorShape();
		c.moveShape();
		
		/*
		 * Interface "Shapes" cannot be instantiated inside the "Circle" class.
		 * Shapes s = new Shapes();
		 * when we do this we get error as "Cannot instantiate the type Shapes"
		 */
		
	}

	@Override
	public void drawShape() {
		System.out.println("Draw circle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Color circle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("Move circle");
		
	}

}
