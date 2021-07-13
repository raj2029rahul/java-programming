package basics;

public class Factorial {

	public static void main(String[] args) {
		
		int n=5,m;
		m=fact(n);
		System.out.println("factorail is: "+m);
	}
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}

}
