package java1;

public class Counttheno {

	public static void main(String[] args) {
		int num=238;
		int num1=num;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
System.out.println("count of digits in "+num1+ "is"+count);
	}

} 
