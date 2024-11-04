

public class pgm16 {
	public static void main(String[] args) {
		int no=123456;
		int num2=no/1000;
		int num=no%1000;
		System.out.print(num2);
		while(num!=0)
		{
			int rem=num%10;
			
			System.out.print(rem);
			num=num/10;
		}
		
	}
}
