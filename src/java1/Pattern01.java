package java1;

public class Pattern01 {

	public static void main(String[ ] args) 
	{
		int n=3;
		int num=n-1;
		int c=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print("  ");
			}
				for(int k=0;k<c;k++)
				{
					System.out.print("*");
				}
				System.out.println(  );
				num--;
				c=c+2;
			}
		 
		}


		

	}

