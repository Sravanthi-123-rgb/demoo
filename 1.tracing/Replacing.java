//wap to print only vowels in a string
class Replacing 
{
	public static void main(String[] args) 
	{
		String str="programming";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					System.out.print(ch);	
				}
		}
		
	}
}
