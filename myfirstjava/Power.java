package myfirstjava;
import java.math.*;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		int m,n;
		double power;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		power=Math.pow(m,n);
		System.out.println(power);
	}

}
