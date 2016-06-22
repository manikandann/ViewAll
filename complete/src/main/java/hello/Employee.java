package hello;

public class Employee {

	private int id;
	private String name;
	private long Salary;
	
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	public Employee(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
}
