package java1;

public class Sumofproductofconsno {

	public static void main(String[] args) {
		int num=2315;
		int ld1;
		int ld2;
		int sum=0;
		while(num>0)
		{
           ld1=num%10;//for extracting a digit from no
           num=num/10;//for removing a digit from no
           ld2=num%10;
		sum=sum+(ld1*ld2);
		}
		System.out.println(sum);
           
           
          
           
		}

	}


