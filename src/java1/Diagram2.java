package java1;

public class Diagram2 {

	public static void main(String[] args) {
		int n=4;
		int num= 1;
		for(int i=0;i<n; i++)
		{
			for(int j=0;j<(i*2)+1;j++)
			{
			System.out.print(num);
			num++;
	   if(num==10)
		 {
			num=1;
		 }
		}
  System.out.println(  );
	}

}
	}

