package java1;

public class String09 {

	public static void main(String[] args) 
	{
	String s1="AbCdEFg";
 char[]ch=s1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='A' && ch[i]<='Z')
		{
		ch[i]=(char) (ch[i]+32);
		}
		else 
		{
			ch[i]=(char)(ch[i]-32);
		}
	}
s1=new  String(ch);
System.out.println(s1);
	}

}
