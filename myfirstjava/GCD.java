package myfirstjava;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		n1=sc.nextInt();
		System.out.println("enter second number");
		n2=sc.nextInt();
		System.out.println(gcd(n1,n2));

	}
	//euclid division algorithm
	  static int gcd(int n1,int n2) {
		if(n1==0 || n2==0)
			return 0;
		if(n1==n2)
			return n1;
		if(n1>n2)
			return gcd(n1-n2,n2);
		else
			return gcd(n1,n2-n1);
		
	}

}
