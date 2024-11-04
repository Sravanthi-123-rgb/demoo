

public class pgm10 {
	public static void main(String[] args) {
		int no=1234567;
		int sume=0;
		int sumo=0;
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
		}
		
	}


