package part02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import part02.dao.MemDAO;
import part02.dto.MemDTO;

public class MemTest {

	public static void main(String[] args) {
		
		MemDAO dao = new MemDAO();
		System.out.printf("Total Record:%d\n",dao.cntMethod());
		
		//insert 단일
//		dao.insertMethod(new MemDTO("신도일", 28, "경기"));
//		dao.insertMethod(new MemDTO("여진구", 28, null));
		
		//update (변경)
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "유대리");
//		map.put("age", 35);
//		map.put("loc", "제주");
//		map.put("num", 5);
//		dao.updateMethod(map);
		
		// 번호로 삭제
//		dao.deleteMethod(14);
		
		//멀티 인설트
//		List<MemDTO> insertList = new ArrayList<MemDTO>();
//		insertList.add(new MemDTO("java",20,"toronto"));
//		insertList.add(new MemDTO("jsp",15,"summary"));
//		int chk = dao.multiInsertMethod(insertList);
//		System.out.printf("Insert Record : %d\n",chk);
		
		//멀티 삭제
//		int chk = dao.multiDeleteMethod(new int[] {15,16});
//		System.out.printf("Delete Record : %d\n", chk);
		
		
		
//		List<MemDTO> aList = dao.allMethod();
//		display(aList);
//		dao.multiUpdate(new MemDTO(12,"스미스씨",0,null));
//		dao.multiUpdate(new MemDTO(12,null,1,null));
//		dao.multiUpdate(new MemDTO(12,"새우깡",39,"농심"));
		
		// 추가
//		dao.insDymicMethod(new MemDTO("점심",38,"화장실"));
		dao.insDymicMethod(new MemDTO("새벽",38,null));
		
		List<MemDTO> aList = null;
		aList = dao.searchMethod(new MemDTO());
		
		//특정검색
//		aList = dao.searchMethod(new MemDTO("신도일",0,null));
//		aList = dao.searchMethod(new MemDTO(null,20,null));
//		aList = dao.searchMethod(new MemDTO("신도일",30,null)); // or 조건이라 하나만 만족하면 된다
		display(aList);
	

	}// end main()
	
	// 리스트 검색 메소드
	public static void display(List<MemDTO> aList) {
		for(MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(),dto.getAge(),dto.getLoc());
	}

}// end class
	