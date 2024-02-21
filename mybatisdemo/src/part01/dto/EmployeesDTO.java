package part01.dto;

import java.util.Date;

public class EmployeesDTO {
	private int employee_id;
	private String first_name;
	private int salary;
	private Date hire_date;
	private int department_id;
	
	private  DepartmentsDTO dept;
	
	public EmployeesDTO() {
	}

	public int getEmployee_id() {
		return employee_id;
	}
	
	
	

	public DepartmentsDTO getDept() {
		return dept;
	}

	public void setDept(DepartmentsDTO dept) {
		this.dept = dept;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	
	
	
	
}
