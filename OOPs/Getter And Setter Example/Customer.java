
public class Customer {
	private int id;  // Instance Member Variables
	// One Copy Per Object
	private String name;
	private double balance;
	private String phone;
	private String address;
	private String city;
	public void Customer() {
		System.out.println("I am a Function...");
	}
	{
		System.out.println("this is init block");
	}
	void dbCall() {
		
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Customer() {
		dbCall();
		//this(10,"Ram");
		System.out.println("I am a Constructor");
		city = "DELHI";
	}
	
	public Customer(int id , String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	public void takeInput(int id , String name) {
		if(id<0) {
			System.out.println("Invalid Id");
			return ;
		}
		this.id = id;  // Instance Var = Local Var
		this.name =name;
	}
	
	public void print() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("City "+city);
	}
	
	
}
