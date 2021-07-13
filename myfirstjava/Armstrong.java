package myfirstjava;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num,n,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			num=n%10;
			sum=sum+(num*num*num);
			n=n/10;
		}
		if(temp==sum) {
		System.out.println("Armstrong number");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
