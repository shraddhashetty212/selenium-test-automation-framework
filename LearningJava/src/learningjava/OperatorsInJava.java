package learningjava;

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assignment operator "="
		int mynumber = 10;
		String str = "String demo";
		
		//Arithmetic operator
		int number1 = 10;
		int number2 = 20;
		number1++;
		number1--;
		System.out.println(number1+number2);
		System.out.println(number1+str); //concatenate when string is present
		System.out.println(number2/number1);
		
		
		
		//Unary - Boolean
		boolean bool = !true;
		System.out.println(bool);
		
		if(number1==number2)
		{
			System.out.println("Numbers are equal");
		}
		else
		{
			System.out.println("Numbers are not equal");
		}
		
		
		if(number1>number2)
		{
			System.out.println("Number1 is greater than number2");
		}
		else
		{
			System.out.println("Number1 is less than number2");
		}
		
		//Conditional AND operator
		if((number1==10) && (number2==20))
		{
			System.out.println("This is conditional AND Operator");
		}
		

	}

}

/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 */
