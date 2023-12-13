package learningjava;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		do
		{
			System.out.println(i);
			i++;

		} while(i > 5);
		System.out.println("Outside do while loop");
		
		
		while (i > 5) {
			System.out.println(i);
		}
		System.out.println("Outside while loop");

	}

}
