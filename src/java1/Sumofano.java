package java1;

public class Sumofano {

	public static void main(String[] args) {
	   int num=234;
	   int sum=0;
	   int ld;
	   while(num>0)
	   {
		  ld=num%10;
		  sum=sum+ld;
		  num=num/10;
	   }
	   System.out.println(sum);

	}

}
