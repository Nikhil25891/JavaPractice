package JavaPracticePackage;

public class NestedForLoop1 {

	public static void main(String[] args) {
		
		int k = 1;
		
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < 4-i ; j++)
			{
				System.out.print(k);
				
				k = k + 1;
				
				System.out.print("   ");
			}
			System.out.println(" ");
		}

	}

}
