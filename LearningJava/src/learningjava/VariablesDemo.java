package learningjava;

public class VariablesDemo {
	
	//instance variable
	int j = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//type variablename = value;
		int mynumber = 10;
		int secondnumber = 10;
		char ch = 'A';
		String str1 = "Shetty";
		System.out.println(str1+" "+mynumber);
		System.out.println(mynumber+secondnumber);
		System.out.println(str1+" "+mynumber+" "+secondnumber);
		System.out.println(str1+" "+mynumber+secondnumber);
		
		//to use the instance variable inside we have to create an object of the class

	}
	
	public void myMethod()
	{
		
		//local variable
		int i = 20;
	}

}
