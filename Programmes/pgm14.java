

public class pgm14 {
	public static void main(String[] args) {
		int no=123456;
		int mul=1;
		int rem;

			
			int num2=no/1000;
			int num3=no%1000;
			while(num2!=0)
			{
				rem=num2%10;
				 mul=mul*rem;                                                                                                                                                                         
				 num2=num2/10;
				
			}
//			
		
	System.out.print(mul);
	System.out.print(num3);
	
	}	


}
