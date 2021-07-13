abstract class Loan{
	double loanAmount,intrestRate,noOfYear;
	Loan(double loanAmount, double intrestRate, double noOfYear){
		this.loanAmount=loanAmount;
		this.intrestRate=intrestRate;
		this.noOfYear=noOfYear;
	}
	abstract double calculateInterest();
}
class EducationLoan extends Loan{
	double si;
	EducationLoan(double loanAmount, double intrestRate, double noOfYear){
		super(loanAmount,intrestRate,noOfYear);
	}
	double calculateInterest(){
		si=(loanAmount*intrestRate*noOfYear)/100;
		return si;
	}	
}
class HomeLoan extends Loan{
	double ci;
	HomeLoan(double loanAmount, double intrestRate, double noOfYear){
		super(loanAmount,intrestRate,noOfYear);
	}
	double calculateInterest(){
		ci=loanAmount*(Math.pow((1+intrestRate/100),noOfYear));
		return ci;
	}
}
class Cal_intrest{
	public static void main(String[] args){
		EducationLoan ei=new EducationLoan(1000,5,2);
		System.out.println("simple intrest of education loan:"+ei.calculateInterest());
		HomeLoan hi=new HomeLoan(5000,5,5);
		System.out.println("compound intrest of education loan:"+hi.calculateInterest());
	}
}
