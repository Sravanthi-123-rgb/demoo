class Pgm1 
{
	static void div1(){
		int a = 7;
		int b = 35;
		System.out.println(a/b);
		a = 35+a-b;
		b =49+b*a;
		System.out.println(a*b/a);
	}

	public static void main(String[] args) 
	{
		div1();
	}
}