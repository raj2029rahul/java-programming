package question1;

public class Account {
	int acc_no,bal_amont,depo_amt,wid_amt;
	String name="anthony";
	String[] ty_o_accnt= {"saving","current"};
	public void getinfo(int x,int y)
	{
		acc_no=x;
		bal_amont=y;
	}
	public void deposite_amnt(int z)
	{
		int a;
		depo_amt=z;
		System.out.println("current balance is:"+bal_amont);
		System.out.println("deposited balance is:"+depo_amt);
		a=bal_amont+depo_amt;
		System.out.println("updated balance is:"+a);
		bal_amont=a;
	}
	public void withdraw_amt(int w )
	{
		int m;
		wid_amt =w;
		System.out.println("current balance is:"+bal_amont);
		m=bal_amont-wid_amt;
		System.out.println("balance after withdraw:"+m);
		bal_amont=m;
	}
	public void display()
	{
		System.out.println("Name of account holder:"+name);
		System.out.println("available balance is:"+bal_amont);
	}
}
