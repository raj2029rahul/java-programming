import java.util.Random;
class RandomDemo{
	public static void main(String[] args){
		Random ran=new Random();
		int num1=ran.nextInt(1000);
		int num2=ran.nextInt(1000);
		System.out.println("Random number from num1 is:"+num1);
		System.out.println("Random number from num1 is:"+num2);
	}
}
