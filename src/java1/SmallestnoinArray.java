package java1;


   public class SmallestnoinArray {

	public static void main(String[] args) 
	{
   
	int[] a= {6,7,8,4};
	int min=a[0];
	
	for(int i=1;i<a.length;i++)
	{
	 if(a[i]<min)
	 {
		min=a[i]; 
	 }
	}
	System.out.println("smallest no:"+ min);

	}

  }
	
	
