

public class pgm20 {
	public static void main(String[] args) {
		int no=12345678;
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
		
		if(count%2==0)
		{	System.out.println("count is even "+count);
			for(int i=count;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println("The Factorial of count "+ " is "+fact);
		}
		else
			System.out.println("count is odd "+count);
		
		
		
	}

}
