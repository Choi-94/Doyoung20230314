package day12;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	List<StudentDTO> list = new ArrayList<>();

	public boolean save(StudentDTO studentDTO) {
		return list.add(studentDTO);
	}
	
	public List<StudentDTO> findAll(){
		return list;
	}
	public StudentDTO findById(String sno) {
		for(StudentDTO s : list) {
			if(s.getSno().equals(sno)) {
				return s;
			}
		}
		return null;
	}
	
	public boolean update(StudentDTO studentDTO,String sno) {
		for(StudentDTO s : list) {
			if(s.getSno().equals(sno)) {
				s.setKor(studentDTO.getKor());
				s.setEng(studentDTO.getEng());
				s.setMat(studentDTO.getMat());
				s.setGrade();
				return true;
			}
		}
		return false;
	}
	public boolean delete(String sno) {
		for(StudentDTO s : list) {
			if(s.getSno().equals(sno)) {
				list.remove(s);
				return true;
			}
		}
		return false;
	}
}
