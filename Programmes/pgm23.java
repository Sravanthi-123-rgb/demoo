
public class pgm23 {
	public static void main(String[] args) {
		int no=1234;
		int sum=0;
		int fact=1;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("the sum of digits is "+sum);
		if(sum%2==0)
			{
			for(int i=sum;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println("The fact of even no is "+fact);
			}
		else
			System.out.println(sum+" is odd");
	}

}
