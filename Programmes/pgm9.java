

public class pgm9 {
	public static void main(String[] args) {
		int no=12345678;
		int mul=1;
		while(no!=0)
		{
			int rem=no%10;
			mul=mul*rem;
			no=no/10;
		}
		System.out.println("the Multiplication of digits is "+mul);
		if(mul%2==0)
			System.out.println(mul+" is even");
		else
			System.out.println(mul+" is odd");
	}

}
