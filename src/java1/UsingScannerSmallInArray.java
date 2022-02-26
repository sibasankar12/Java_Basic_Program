package java1;

import java.util.Scanner;

public class UsingScannerSmallInArray {

	public static void main(String[] args) {
		int  []a=new int[4];
		int min;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		  min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		
		}
		System.out.println("minimum no is:"+min);
	}

}
