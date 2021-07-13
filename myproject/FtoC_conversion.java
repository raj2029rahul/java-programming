package myproject;

import java.util.Scanner;

public class FtoC_conversion {

	public static void main(String[] args) {
		try
		(Scanner K =new Scanner(System.in)){
		double f,c;
		System.out.println("enter value in farenheit:");
		f=K.nextDouble();
		c=(double)(f-32)/(double)1.8;
		System.out.println("after conversion="+c);
	}
}
}