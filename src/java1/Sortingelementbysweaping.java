package java1;

public class Sortingelementbysweaping {

	public static void main(String[] args)
	{
	int [] a= {13,9,6,35,4};	
    int n=a.length; 
     int temp;
	for(int i=0;i<n;i++)
     {
    	 for(int j=a[i];j<n-1;j++)
    	 {
    		 if(a[i]>a[i+1])
    		 {
    		  temp=a[i];
    		  a[i]=a[i+1];
    		  a[i+1]=temp;
    		  
    			  }
    		 else
    		 {
    			 break;
    		 }
    	 }
    	 System.out.println(a[i]);
     }
	}
}
