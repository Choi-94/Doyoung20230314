package day17_20230316;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolRepository {
	
	Map<String,SchoolDTO> map1 = new HashMap<>();
	private List<SchoolDTO> list = new ArrayList<>();
	SchoolDTO schoolDTO = new SchoolDTO();
	
	public boolean save(String studentNumber, SchoolDTO schoolDTO) {
		map1.put(studentNumber, schoolDTO);
		boolean a = list.add(schoolDTO);
		return a;
	}
	
	
	public Map<String, SchoolDTO> studentlist() {
		List<String> keys = new ArrayList<>(map1.keySet());
		Collections.sort(keys);
		for(String key : keys) {
			System.out.println(map1.get(key));
		}
		return map1;
	}
	
}