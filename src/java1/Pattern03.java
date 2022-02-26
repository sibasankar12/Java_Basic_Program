package java1;

public class Pattern03 {

	public static void main(String[] args)
	{
		int n=5;
		int sp=2;
		int c=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<sp;j++)
			{
				System.out.print(" " );
			}
			for(int k=0;k<c;k++)
			{
				System.out.print("*");
			}
			System.out.println(  );
			sp--;
			c++;
			
			
		}
	}
}
		

	


