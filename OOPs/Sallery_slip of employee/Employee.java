
public class Employee {
	private int id;
	private String name;
	private double salary;
	private final String COMPANY_NAME;
	private final double DEFAULT_SALARY;
	Employee(){
		COMPANY_NAME = "TCS";
		DEFAULT_SALARY = 4000;
	}
	Employee(int id , String name){
		this();
		this.id = id;
		this.name = name;
		this.salary = DEFAULT_SALARY;
	}
	Employee(int id, String name, double salary){
		this(id,name);
		this.salary = salary;
	}
	public double hra() {
		return salary * 0.30;
	}
	public double da() {
		return salary * 0.10;
	}
	public double ta() {
		return salary * 0.20;
	}
	public double pf() {
		return (salary * 0.05);
	}
	public double gs() {
		return salary  + hra() + da() +ta() - pf();
	}
	public double tax() {
		return gs()>100000?(gs()*0.30):(gs()*0.20);
	}
	public double ns() {
		return gs() - tax();
	}
	
	public void printSalarySlip() {
		System.out.println("COMPANY : "+COMPANY_NAME );
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Basic Salary "+salary);
		System.out.println("HRA "+hra());
		System.out.println("DA "+da());
		System.out.println("TA "+ta());
		System.out.println("PF "+(pf()*2));
		System.out.println("GS "+gs());
		System.out.println("TAX "+tax());
		System.out.println("NS "+ns());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	
	

}
