package myproject;

public class Divisbleby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=100,n2=200,i,sum=0,count=0;
		
		for(i=n1;i<=n2;i++)
		{
			if(i%7==0)
			{
				sum=sum+i;
				count++;
			}
		}
		System.out.println("sum will be:"+sum);
		System.out.println("total number divisible by 7:"+count);
	}

}
