package learningjava;

public class AddingParametersToMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddingParametersToMethods aptm = new AddingParametersToMethods();
		System.out.println(aptm.addNumbers(5, 10));
		aptm.diffParameters("This is string", 12, 13);

	}
	
	public int addNumbers(int x, int y)
	{
		return x + y;
	}
	
	public void diffParameters(String s, int i, int j)
	{
		System.out.println(s);
		System.out.println(i);
		System.out.println(j);
	}

}