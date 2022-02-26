package java1;

public class Duplicatearray {

	public static void main(String[] args) 
	{
		int []a= {1,2,3};
		int []b=new int[a.length];
       for(int i=0;i<a.length;i++) 
       {
    	   b[i]=a[i];
    	   
       }
	   
	   System.out.println("array a is:");
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]+ " ");
	   }
	  
	   System.out.println("array b is:");
	   for(int i=0;i<b.length;i++)
	   {
		   System.out.println(b[i]+" ");
	   
	}

	
	}

}
