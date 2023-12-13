package learningjava;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//doLogin();
		/*
		 * we cant directly call the doLogin or doLogout methods inside main.
		 * to call them either convert the methods below to static OR
		 * create an object of the class and then call the method using the object, like:
		 * 
		 */
		
		MethodsDemo md = new MethodsDemo();
		md.doLogin();
		md.doLogin();
		md.doLogout();

	}
	
	public void doLogin()
	{
		System.out.println("Login successful");
	}
	
	public void doLogout()
	{
		doLogin();
		System.out.println("Logout successful");
	}

}
