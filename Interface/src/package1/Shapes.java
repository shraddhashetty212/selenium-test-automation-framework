package package1;

public interface Shapes {
	
	//can't specify any concrete method inside interfaces or abstract classes
	//the methods also have to be abstract.
	/*
	public void drawShape()
	{
		System.out.println("Normal/Concrete method");
	}
	*/
	
	public void drawShape();
	
	public void colorShape();
	
	public void moveShape();

}
