import java.util.*;
public class Pat2{
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows :");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
