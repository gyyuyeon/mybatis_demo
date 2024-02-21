package part01;

import java.util.List;

import part01.dao.EmployeesDAO;
import part01.dto.DepartmentsDTO;
import part01.dto.EmployeesDTO;

public class EmpTest {

	public static void main(String[] args) {
		EmployeesDAO dao = new EmployeesDAO();
		
//		System.out.println("Total Record:" + dao.countMethod());
//		
//		List<EmployeesDTO> aList = dao.getList();
//		for(EmployeesDTO dto: aList)
//			System.out.printf("%d %s %d %s\n", dto.getEmployee_id(),dto.getFirst_name(),
//					dto.getSalary(),dto.getHire_date());
		
//		List<EmployeesDTO> aList = dao.asJoinMethod();
//		for(EmployeesDTO empDTO: aList) {
//			DepartmentsDTO deptDTO = empDTO.getDept();
//			System.out.printf("%d %s %d %s %d %s\n",
//					empDTO.getEmployee_id(),empDTO.getFirst_name(),
//					empDTO.getSalary(),empDTO.getHire_date(),
//					deptDTO.getDepartment_id(),deptDTO.getDepartment_name());	
//		}
		
		List<DepartmentsDTO> aList = dao.acJoinMethod();
		for(DepartmentsDTO deptDTO: aList) {
			System.out.printf("%d %s \n", deptDTO.getDepartment_id(),deptDTO.getDepartment_name());
			for(EmployeesDTO empDTO : deptDTO.getEmpList()) {
				System.out.printf("%20s %d %s %d %s\n", " ",
						empDTO.getEmployee_id(),
						empDTO.getFirst_name(),
						empDTO.getSalary(),
						empDTO.getHire_date()
						);
			}
			
					
		}
		
		
		
	}

}
