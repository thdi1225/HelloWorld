package co.micol.prj;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.dto.StudentVO;

public class MapTest {
	public void mapTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("address", "대구광역시");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("address"));
	}
	
	public void studentMap() {
		Map<Integer, StudentVO> map = new HashMap<Integer, StudentVO>();
		map.put(0, new StudentVO("홍길동"));
		map.put(1, new StudentVO("박길동"));
		map.put(2, new StudentVO("김길동"));
		
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
	}
}
