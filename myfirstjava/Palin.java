package myfirstjava;
import java.util.Scanner;
public class Palin {

	public static void main(String[] args) {
		int n,rev=0,num,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check palindrome");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			num=n%10;
			rev=rev*10+num;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		//System.out.println(rev);
	}

}
