package learningjava;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 4; i++)
		{
			int j = 1;
			while (j <= 5)
			{
				for (int x = 1; x <= 2; x++) 
				{
					System.out.println("Value of i is "+i+" and value of j is "+j+
							" and value of x is "+x);
				}
				j++;
			}
		}

	}

}
