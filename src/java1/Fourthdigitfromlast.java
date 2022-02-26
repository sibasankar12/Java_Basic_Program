package java1;

public class Fourthdigitfromlast {

	public static void main(String[] args) {
		int num=431245;
		int n=4;
      	int i=0;
		while(num>0)
		{
	       i++;
	       if(i==n)
	       {
	    	   break;
	       }
	num=num/10;	
		}
int ld=num%10;
System.out.println(ld);
	}

}
