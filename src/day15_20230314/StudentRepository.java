package day15_20230314;

import java.util.HashMap;
import java.util.Map;

import day12.StudentDTO;

public class StudentRepository {
	StudentDTO studentDTO = new StudentDTO();
	
	Map<Integer,String> map1 = new HashMap<>();
	
	public void save(StudentDTO studentDTO) {
		return map1.add(studentDTO);
	}
}
