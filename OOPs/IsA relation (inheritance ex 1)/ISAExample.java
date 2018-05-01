class Loan{
	double amount = 5000;
	void applyForLoan()
	{
		System.out.println("Loan Apply For Loan....");
	}
	void roi() {
		System.out.println("10% ROI for Loan..."+amount);
	}
}
class HomeLoan extends Loan
{
	double amount = 10000;
	void show() {
		System.out.println("this is show...");
	}
	void print() {
		System.out.println("this is print..");
	}
	@Override
	void roi() {
		//super.roi();
		//this.print();
		System.out.println("Home Loan ROI is 10.5% "+this.amount);
	}
}
class AutoLoan extends Loan{
	double amount = 4000;
	void display() {
		System.out.println("Auto Loan Display...");
	}
	@Override
	void roi()
	{
		//super.roi();
		System.out.println("Auto Loan ROI is 12.5% "+this.amount);
	}
}
class LoanCaller{
	void call(Loan loan) {
		loan.applyForLoan();
		loan.roi();
		System.out.println("L AMT "+loan.amount);
		if(loan instanceof HomeLoan) {
			HomeLoan h = (HomeLoan) loan; // Downcasting
			h.print();
			h.show();
			System.out.println("H AMT "+h.amount);
			System.out.println("Ref is "+(h==loan));
		}
		else
		if(loan instanceof AutoLoan) {	
			((AutoLoan) loan).display();
			//((AutoLoan)loan).display();
			
		}
	}
}
public class ISAExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanCaller loanCaller = new LoanCaller();
		loanCaller.call(new HomeLoan());
		System.out.println("******************");
		loanCaller.call(new AutoLoan());
		//HomeLoan l = new Loan();
//		HomeLoan loan = new HomeLoan();
//		loan.applyForLoan();
//		loan.roi();
//		//homeLoan.print();
//		System.out.println("Amount is "+loan.amount);
//		System.out.println("*************************************");
//		loan = new AutoLoan();
//		//AutoLoan autoLoan = new AutoLoan();
//		autoLoan.applyForLoan();
//		autoLoan.roi();
//		System.out.println("Amount "+loan.amount);
		
	}

}
