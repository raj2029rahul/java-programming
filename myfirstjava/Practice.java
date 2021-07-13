// fibonacii series using recursion
package myfirstjava;

import java.util.Scanner;

public class Practice {
	 static long a=0,b=1,c=0;
	static void fibo(long num) {
		if(num>0) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+ c);
			fibo(num-1);
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter num of series for fibonacii :");
		long num=in.nextInt();
		System.out.print(a +" "+ b);
		fibo(num-2);
	}
}
