

public class pgm22 {
	public static void main(String[] args) {
		int no=1234;
		int sum=0;
		int fact=1;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}
			no=no/10;
		}
		System.out.println(sum);
		for(int i=sum;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of sum of odd  is "+fact);
	}

}
