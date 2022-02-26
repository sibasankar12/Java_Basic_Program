package java1;

public class ReversetheelementArray {

	public static void main(String[] args) 
	{
		int n=5;
	int[]a= {2,6,3,4,8};
	for(int i=0;i<n/2;i++)
	{
     	a[i]=a[i]+a[n-i-1];
     	a[n-i-1]=a[i]-a[n-i-1];
     	a[i]=a[i]-a[n-i-1];
	}
     	for(int i=0;i<n;i++)
	  {
     	System.out.println(a[i]);	
	}
    
	}

}
