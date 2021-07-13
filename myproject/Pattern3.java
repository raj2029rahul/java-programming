package myproject;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,k;
		Scanner p=new Scanner(System.in);
		System.out.println("enter no of rows");
		n=p.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(i);
			}
			System.out.println("\n");
		}
	}

}
