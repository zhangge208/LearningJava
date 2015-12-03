package Store;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {         //JavaBean  µÃÂ¿‡
	private int id;
	private String name;
	private int salary;
	private String department;
	private Date hireDate;
	
	public Employee(int id, String name, int salary, String department, String hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		DateFormat format = new SimpleDateFormat("yyyy-MM");
		try {
			this.hireDate = format.parse(hireDate);
		} catch (ParseException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public Employee() {
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int i) {
		this.salary = i;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
}
