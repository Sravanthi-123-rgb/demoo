

public class pgm8 {
	public static void main(String[] args) {
		int no=1234567;
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
	}
}
