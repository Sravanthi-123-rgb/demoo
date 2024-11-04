

public class pgm26 {
	public static void main(String[] args) {
		int no=12;
		int mul=1;
		int fact=1;
		while(no!=0)
		{
			int rem=no%10;
			mul=mul*rem;
			no=no/10;
		}
		System.out.println("the Multiplication of digits is "+mul);
		if(mul%2==0) {
		System.out.println(mul+" is even");
		for(int i=mul;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("the fact of even no is "+fact);
	}
		
		else
			System.out.println(mul+" is odd");
	}
	


}
