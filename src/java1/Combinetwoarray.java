package java1;

public class Combinetwoarray {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {4,5,6};
		int a1=a.length;
		int b1=b.length;
		int c1= a1+b1;
		int[] c= new int[c1];
		for(int i=0;i<a1;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b1;i++)
		{
			c[a1+i]=b[i];
		}
		for(int i=0;i<c1;i++)
		{
			System.out.println(c[i]);
		}
	}

}
