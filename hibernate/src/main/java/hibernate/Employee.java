package hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table (name="employee")
public class Employee {
//	@Id 
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	@Column(name="id")
	private int id;
	
//	@Column(name="first_name")
	private String firstName;
	
//	@Column(name="last_name")
	private String lastName;
	
//	@Column(name="salary")
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public Employee() {
	}
	
	public int getId()
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	public int getSalary()
	{
		return this.salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	
}
