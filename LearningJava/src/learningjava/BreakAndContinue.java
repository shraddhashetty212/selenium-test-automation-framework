package learningjava;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10; i++)
		{
			if (i==7)
			{
				//break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Final statement");

	}

}