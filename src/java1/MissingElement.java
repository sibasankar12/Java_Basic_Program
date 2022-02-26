package java1;

public class MissingElement {

	public static void main(String[] args) 
	{
	int[]a= {1,4,6,7,9};
	int n= a.length;
	for(int i=0;i<n-1;i++)
	{
	for(int j=a[i]+1;j<a[i+1];j++)
	{
	System.out.println(j);	
	}
	}

	}

}
