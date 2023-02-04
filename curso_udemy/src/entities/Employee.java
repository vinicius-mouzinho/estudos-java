package entities;

public class Employee {
	
	private String name;
	private Integer id;
	private Double salary;
	
	public Employee() {
		
		
	}
	
	public Employee(String name, int id, Double salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public Integer getId() {
		
		return id;
		
	}
	
	public void setId(Integer id) {
		
		this.id = id;
		
	}
	
	public Double getSalary() {
		
		return salary;
		
	}
	
	public void setSalary(Double salary) {
		
		this.salary = salary;
		
	}
	
	public void increaseSalary(double percentage) {
		
		salary += (salary * percentage / 100.00);
		
	}
	
	
	
	public String toString() {
		
		return id + ", " + name + ", " + String.format("%.2f", salary);
		
	}
	
	
}
