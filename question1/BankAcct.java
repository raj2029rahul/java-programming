package question1;

public class BankAcct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account act=new Account();
		act.getinfo(1234567, 45000);
		act.deposite_amnt(10000);
		act.withdraw_amt(5000);
		System.out.println("account no is:"+act.acc_no);
		System.out.println("name of acc holder:"+act.name);
		System.out.println("available balance is:"+act.bal_amont);
	}
}
