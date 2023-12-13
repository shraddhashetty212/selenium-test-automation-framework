package package1;

public class Rectangle extends Shapes{

	public static void main(String[] args) {
		
		//Shapes s = new Shapes();  --> this cannot be done bcz abstract classes cannot be instantiated

		Rectangle r = new Rectangle();
		r.drawShape();
		r.colorShape();
		r.moveShape();
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing rectangle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Coloring rectangle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("Moving rectangle");
		
	}

}
