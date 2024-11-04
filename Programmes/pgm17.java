

public class pgm17 {
	public static void main(String[] args) {
		int no=123456;
		int num1=no%1000;
		int num2=no/1000;
		while(num2!=0)
		{
			int rem=num2%10;
			System.out.print(rem);
			num2=num2/10;
		}
		while(num1!=0)
		{
			int rem=num1%10;
			System.out.print(rem);
			num1=num1/10;
		}
//		System.out.println(num1);
//		System.out.println(num2);
	}

}
