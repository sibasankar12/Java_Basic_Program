package java1;

public class SumOfFirst10Terms {

	public static void main(String[] args) {
	
		int a=1;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.print(a+" , ");
			sum=sum+a;
			a=a+3;		
		}
		System.out.println();
		System.out.println("Sum is "+sum );
       
	}

}
