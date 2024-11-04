

public class pgm18 {
	public static void main(String[] args) {
		int no=1234567;
		int count=0;
		int fact=1;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				count++;
			}
			no=no/10;
			
		}	
		System.out.println(count);
		for(int i=count;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of count "+ " is "+fact);
		
		
	}

}
