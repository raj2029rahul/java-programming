package myproject;

import java.util.Scanner;

public class SumSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
	    (Scanner s= new Scanner(System.in)){
		int i,n;
		double sum=0.0;
		System.out.println("enter number of sequence");
		 n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
		}
		
		System.out.println(sum);
	}
  }
}
