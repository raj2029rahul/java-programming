package basics;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1,c,n=8, count;
		count=2;
		System.out.println(a);
		System.out.println(b);
		do
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			count++;
		}while(count<n);
		
	}

}
