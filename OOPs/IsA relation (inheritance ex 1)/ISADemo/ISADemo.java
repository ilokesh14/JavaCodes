//account class crerated ...
class Account{
	int id;
	String name;
	double balance;

//some methods of account class are created ...

void deposit(){
	System.out.println("Show Pan Card >50K Transaction");	
	}
	
	void roi() {
		System.out.println("2% Generic...");
	}
}

//class savingsaccount is created which extends account class ,which means it inherites the features of account class ... 

class SavingAccount extends Account{
 // Save 
	void withDraw() {
		System.out.println("50K Per Day Limit...");	
		}

/*roi() method is overridden here and @Override is written before it to tell the compiler that this method is override or to double check (As the compiler will give error when we fail to override the method and write @Override before it ...*/ 

	@Override
	void roi() {
	//here super.roi() calls to parent class roi() method ...
		super.roi();
		System.out.println("ROI is 4% Rec...");
	}
}

//class currentaccount is created which extends account class ,which means it inherites the features of account class ... 

class CurrentAccount extends Account{
	void withDraw() {
		System.out.println("No  Limit...");	
		}
	void odLimit() {
		System.out.println("OverDraft ...");
	}

/*roi() method is overridden here and @Override is written before it to tell the compiler that this method is override or to double check (As the compiler will give error when we fail to override the method and write @Override before it ...*/ 

	@Override
	void roi() {
		super.roi();
		System.out.println("ROI MUST BE PAY 6%");
	}
}

//AccountCaller class is made to generate object of desired class by using downcasting 

class AccountCaller{

/* 
Here (Account ac) is a object of Account class and caller is the method that can take object refernece as its argument ...
That is why deposite and roi methods of Account class can directly be called ...
While for caling the methods of we have to downcast the account class object to the child class object i.e. SavingAccount or      	CurrentAccount object and now we can call their object from here 
*/

	void caller(Account ac) {
		ac.deposit();
		ac.roi();
		//ac.withDraw();
		//ac.odLimit();
		System.out.println("*********************");

/*
Here we are checking whether the object ac is an instance of SavingAccount class or not ... And if it is then are typecting( or  DOWNCASTING ) it into SavingAccount class object ... 
*/	

if(ac instanceof SavingAccount) {

	/*SavingAccount sa = (SavingAccount) ac; 	//Downcasting (Typecasting into SavingAccount class object . 
	sa.withDraw(); 					//Now sa is SavingAccount class object and call its class methods s shown .
	sa.roi();*/
	((SavingAccount)ac).withDraw();
	//((SavingAccount)ac).roi(); 	This is another method of downcasting as well as caling the method simultaniously .
	}
	else if(ac instanceof CurrentAccount) {
			CurrentAccount ca = (CurrentAccount) ac; //Downcasting
			ca.withDraw();
			//ca.roi();
			ca.odLimit();
		}
	}
}

public class ISADemo {

	public static void main(String[] args) {

	//Here we create an object of AccountCaller class ...

		AccountCaller accountCaller = new AccountCaller();

	//And the object of AccountCaller class is upcasated to saving or current account class using caller method ... 

		accountCaller.caller(new SavingAccount());  //Upcasting
		accountCaller.caller(new CurrentAccount());
			

		
		//SavingAccount sa = new Account();  We cannot do this as small variable cannot hold big reference .. 

		/*Account ac = new SavingAccount();  //Upcasting,We can do this as big variable can store smaller reference ..
		
		 * ac = new CurrentAccount();
		ac.roi();
		ac.deposit();
		*/
		//ac.withDraw();
		//int x = 100.20;
		//SavingAccount sa = new SavingAccount();
		// Type refVar = new Type();
		
		
		// TODO Auto-generated method stub
		/*SavingAccount sa = new SavingAccount();
		sa.withDraw();
		sa.deposit();
		sa.roi();
		System.out.println("******************************");
		CurrentAccount ca = new CurrentAccount();
		ca.withDraw();
		ca.deposit();
		ca.roi();
		ca.odLimit();
	*/
	}

}
