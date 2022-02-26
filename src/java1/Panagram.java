package java1;
public class Panagram {

	public static void main(String[] args) {
		String s1="The quick brown fox jumps over the lazy dog";
		String s2=s1.toLowerCase();
		String []s3=s1.split(s1);
		int[] s4=new int[26];
		char[] ch= s2.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			count++;
			
			
			{
				
			}
			else
			{
				System.out.println("it is not a panagram");
			}
		}

	}

}
