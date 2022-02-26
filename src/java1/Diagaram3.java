package java1;

public class Diagaram3 {

	public static void main(String[] args) {
	int n=5;
	int num=1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<(i*2)+1;j++)
		{
			if(j%2==0)
			{
				System.out.print(num);
				num++;
				if(num==10) 
				{
				num=1	;
				}
			}
			else
			{
				System.out.print("*");
			}
			}
		System.out.println( );
	}

	}

}
