package learningjava;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive Data Types
		byte bt = -128;
		short sht = 32767;
		int myint = 765784545;
		long lng = 456789876L;
		
		float myfloat = 1.3434f;
		double mydouble = 1.23434d;
		
		boolean bool = false;
		char ch = 'z';
		
		
		//Non-primitive Data type
		
		//to create the object of the class (objects of the class are also non-primitive data types)
		DataTypeDemo dtd = new DataTypeDemo();
		//syntax of creating an object of the class is:-
		//datatypeOftheClass variablename = new Classname();
		
		
		//this is string object
		String str = new String();
		str = "Shraddha";

		//this is string literal
		String str1 = "This is first string";
	}

}

/*
 * https://docs.oracle.com/en/java/javase/20/docs/api/index.html
 * https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/package-summary.html
 */
