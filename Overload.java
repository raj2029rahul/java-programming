class OverloadDemo{
	void test(){
		System.out.println("No parameter passed");
	}
	void test(int a){
		System.out.println("value of a is:"+a);
	}
	void test(int a , int b){
		System.out.println("value of a and b is:"+ a + " " +b);
	}
	double test(double a){
		System.out.println("double value of a:"+a);
		return a*a;
	}
}
public class Overload{
	public static void main(String[] args){
		double res;
		OverloadDemo ob=new OverloadDemo();
		ob.test();
		ob.test(12);
		ob.test(35,70);
		res=ob.test(70.23);
		System.out.println("result of double value is:"+res);
	}
}
