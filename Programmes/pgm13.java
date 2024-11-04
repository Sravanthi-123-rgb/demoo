

public class pgm13 {
	public static void main(String[] args) {
		int no=123456;
		int sum=0;
		int rem;

			
			int num2=no/1000;
			int num3=no%1000;
			while(num2!=0)
			{
				rem=num2%10;
				 sum=sum+rem;                                                                                                                                                                         
				 num2=num2/10;
				
			}
//			
		
	System.out.print(sum);
	System.out.print(num3);
	
	}	


}
