package basics;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345, sum = 0, rem;
		while (n > 0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
