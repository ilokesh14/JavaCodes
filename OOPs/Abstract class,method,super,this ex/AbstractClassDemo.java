//abstract keywor is used to make a class abstract .

abstract class Loan{
	
	//An abstract method contains only the signature,to be overriden by the other classes 

	abstract void roi() ;
		
	
	void withDraw(double amount) {
		
	}
	void applyForLoan(int years) {
		
	}

	//method void emi() is declared as abstract here ...
 
	abstract void emi() ;

	Loan(){
		System.out.println("Loan class Default Cons Call");
	}
	Loan(int param){
		//this() here calls deafault cons .
		this();
		System.out.println("Loan class param cons call "+param);
	}
	
}
class HomeLoan extends Loan{

	//roi() method is overridden here(bcoz it was abstract ) as it was must bcoz HomeLoan extends class Loan
	
	@Override
	void roi() {
		
	}
	HomeLoan(){
		//super(100) here calls parent class para cons .
		super(100);
		//super();
		System.out.println("HomeLoan Default Cons Call");
	}
	HomeLoan(int param){
		this();
		//super(param);
		//super();
		System.out.println("HomeLoan Param Cons Call "+param);
	}
	@Override
	void emi() {
		
	}
}
class AutoLoan extends Loan{
	AutoLoan(){
		super(100);
		System.out.println("Auto Loan Default Cons");
	}
	@Override
void roi() {
		
	}
	@Override
	void emi() {
		
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loan loan = new Loan();
		//Loan loan = new AutoLoan();
		Loan loan = new HomeLoan(99);
	}

}

