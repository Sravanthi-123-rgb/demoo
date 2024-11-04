

public class pgm12 {
	public static void main(String[] args) {
		int no=123456;
		int mul=1;
		int rem;

			int num1=no%1000;
			int num2=no/1000;
			while(num1!=0)
			{
				rem=num1%10;
				 mul=mul*rem;                                                                                                                                                                         
				 num1=num1/10;
				
			}
//			
		
	System.out.print(num2);
	System.out.print(mul);
	
	}	


}
