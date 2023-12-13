package learningjava;

public class StringLiteralVsObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Shraddha";
		
		String str2 = new String("Shraddha");
		
		String str3 = "Shraddha";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);

	}

}

/*
*Here str1 will use memory location and store the value "Shraddha" in it.
*Now str2 will create a new memory location and store "Shraddha" in it which is different from str1.
*So when we compare str1==str2 this will return as false because the memory location is not same.
*But when we do str1.equals(str2) this will compare the value of the two strings so will return as true.
*Similarly if now we initialize str3 as "Shraddha" in a literal way then str3 will not create a new memory.
*If there is already a similar value present then in Java it will use that same memory location for the new varaible.
*So here str3 will point to the memory location of str1 because both contain same value.
*So str1==str3 will return true because both are pointing to same memory location.
*/

