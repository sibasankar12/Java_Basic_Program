package java1;

class String3 
{
public static void main(String[] args)
{
	String s1="Rama is a legend"	;
	String [] s2=s1.split(" ");
	String s3=" ";
	for(int i=0;i<s2.length;i++)
{
	s3=s2[i]+" "+s3;
}
s3=s3.trim();
System.out.println(s3);

	}

}
