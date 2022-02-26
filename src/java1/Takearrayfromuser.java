package java1;

import java.util.Scanner;

public class Takearrayfromuser 
{

	public static void main(String[] args) 
	{
	
	Scanner sc=new Scanner(System.in);
	int[]a= {1,2,3,4,6,8};
	System.out.println("Before swapping");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("enter the index value to be swapped");
	int i1=sc.nextInt();
	int i2=sc.nextInt();
	 
	a[i1]=a[i1]+a[i2];
    a[i2]=a[i1]-a[i2];
    a[i1]=a[i1]-a[i2];
    System.out.println("after swapping ");
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }

	}

}
