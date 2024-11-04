

public class pgm25 {
	public static void main(String[] args) {
		int no=1234;
		int fact=1;
		int mul=1;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2!=0)
			{
				mul=mul*rem;
			}
			no=no/10;
		}
		System.out.println("Multipication of odd nos is "+mul);
		for(int i=mul;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("the fact of mul is "+fact);
	}

}
