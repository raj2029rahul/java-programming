package basics;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(j=i+1;j<=(i-1)*2+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
