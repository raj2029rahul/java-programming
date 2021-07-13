public class Factotial{
	public static void main(String[] args){
		Factorial f=new Factorial();
		System.out.println("factorial of 5:"+f.fact(5));
		System.out.println("factorial of 10:"+f.fact(10));
		System.out.println("factorial of 15:"+f.fact(15));
		System.out.println("factorial of 25:"+f.fact(25));
		System.out.println("factorial of 6:"+f.fact(6));
	}
}
class Factorial{
	int fact( int n){
		int result;
		if(n==1)
			return 1;
		result=fact(n-1)*n;
			return result;
	}
}
