

public class pgm6 {
	public static void main(String[] args) {
		int no=12345671;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("the sum of digits is "+sum);
		if(sum%2==0)
			System.out.println(sum+" is even");
		else
			System.out.println(sum+" is odd");
	}

}
