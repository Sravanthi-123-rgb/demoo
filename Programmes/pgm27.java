

public class pgm27 {
	public static void main(String[] args) {
		int no=1233;
		int sume=0;
		int sumo=0;
		int fact=1;
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			sume=sume+rem;
			else
			sumo=sumo+rem;
			no=no/10;
		}
		System.out.println("the sum of odd no are "+sumo);
		System.out.println("the sum of even no are "+sume);
		
			int mul=sumo*sume;
			System.out.println(mul);
			for(int i=mul;i>=1;i--)
			{
				fact=fact*i;
			}
			System.out.println("the fact of mul is "+fact);
			
		}

}
