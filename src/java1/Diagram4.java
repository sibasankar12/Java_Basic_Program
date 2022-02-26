package java1;

public class Diagram4 {

	public static void main(String[] args) {
	 int n=3;
	 int l=5;
	 int num=l-1;
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<num;j++)
		 {
		 System.out.print( "  " );
		 }
		 for(int j=0;j<(i*2)+1; j++)
		 {
			 System.out.print("*");
		 }
	 System.out.println( );
	 num=num-2;
	}
}
}
