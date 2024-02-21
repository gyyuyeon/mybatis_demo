package part01.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part01.dto.DepartmentsDTO;
import part01.dto.EmployeesDTO;

// apache.org => iBatis =>jdk1.4이상
// google.com => myBatis=> jdk1.5이상
public class EmployeesDAO {

	private SqlSession session;
	
	public EmployeesDAO() {
		System.out.println("employeesDAO");
		String resource = "part01/config/configuration.xml";
		
		try {
		//2. 설정파일을 로딩하기 위해서 입력스트림과 연결한다	
		Reader reader = Resources.getResourceAsReader(resource);
		//3. 설정파일을 저장하기 위한 팩토리를 생성해 줄수 있는 빌더를 생성한다
		SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();  // 여기에 가져온거저장
		
		//4. 설정파일의 정보를 읽어와 sqlBuilder에 생성한다
		SqlSessionFactory factory = sqlBuilder.build(reader);
		
		//5. 쿼리문을 접근할 수 있도록 sqlSession 객체를 리턴한다
		// openSession()의 기본은 false이다
		// 자동커밋을 설정하고 싶으면 openSession(true)로 설정한다
		// 실무에서는 자동 커밋을 사용하지 않느다
		session = factory.openSession();  // 이걸로 호출
		//6.입력스트림 연결종료
		reader.close();
		System.out.println("closeDAO");
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}//
	public int countMethod() {
		return session.selectOne("emp.cnt"); // 셀렉트 퀴리문  namespace, ID
	}
	
	public List<EmployeesDTO> getList(){
		return session.selectList("emp.list");
	}
	
	public List<EmployeesDTO> asJoinMethod(){
		return session.selectList("join.emp_dept");
	}
	
	public List<DepartmentsDTO> acJoinMethod(){
		return session.selectList("join.dept_emp");
	}
	
}//
