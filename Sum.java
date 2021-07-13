import java.util.*;
public class Sum{
	public static void main(String[] args){
		int num,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		num=sc.nextInt();
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
		System.out.println("sum of digits is:"+sum);
	}
}
