package pkg1;

public class CreateBox {

	public static void main(String[] args) {
		
		Common cm = new Common();
		/*  this is when the variables are declared as public
		int h = cm.height1 = 10;
		int l = cm.length1 = 20;
		int b = cm.width1 = 30;
		*/
		
		int l = cm.setLength(20);
		int b = cm.setWidth(10);
		int h = cm.setHeight(15);
		
		cm.setBoxDimension(l, b, h);
		
		System.out.println(cm.getLength());

	}

}
