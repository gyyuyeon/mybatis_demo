package part01.dto;

import java.util.List;

public class DepartmentsDTO {
	private int department_id;
	private String department_name;
	private int manager_id;
	private int location_id;
	private List<EmployeesDTO> empList;
	
	private DepartmentsDTO dept;
	
	public DepartmentsDTO getDept() {
		return dept;
	}

	public void setDept(DepartmentsDTO dept) {
		this.dept = dept;
	}

	public List<EmployeesDTO> getEmpList() {
		return empList;
	}

	public void setEmpList(List<EmployeesDTO> empList) {
		this.empList = empList;
	}

	public DepartmentsDTO() {
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
	
	
	
	
	
	
	
	
}
