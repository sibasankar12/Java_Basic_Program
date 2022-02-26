package java1;

import java.util.Scanner;

public class SecondLargestnoarray {

	public static void main(String[] args) 
	{
    int[] a= new int[5]; 
    int largest=0;
    int secondlargest=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the nos");
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();	
    }
    for(int i=1;i<a.length;i++)
    {
    	if(a[i]>largest)
    	{
    		secondlargest=largest;
    		largest=a[i];
    	}
    }
   System.out.println("second largest number is:"+secondlargest);
	}

}
