import java.util.*;
public class Pat4{
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows :");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
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
