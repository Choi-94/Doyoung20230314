package day17_20230316;

import java.util.Map;
import java.util.Scanner;

public class SchoolService {
	SchoolRepository studentrepository = new SchoolRepository();
	Scanner sc = new Scanner(System.in);
	
	
	public void save() {
		SchoolDTO schoolDTO = new SchoolDTO();
		System.out.print("학생 이름 작성> ");
		String studentName = sc.next();
		System.out.print("학생 국어 점수> ");
		schoolDTO.setKor(sc.nextInt());
		System.out.print("학생 영어 점수> ");
		schoolDTO.setEng(sc.nextInt());
		System.out.print("학생 수학 점수> ");
		schoolDTO.setMat(sc.nextInt());
		schoolDTO.setGrade();
		String studentNumber = schoolDTO.getStudentNumber();
		boolean check = studentrepository.save(studentNumber, schoolDTO);
		if(check) {
			System.out.println("학생 등록 완료!");
		}else {
			System.out.println("학생 등록 실패!");
		}
	}
	public void studentlist() {
		Map<String,SchoolDTO> map1 = studentrepository.studentlist();
	
	}
	
	
	
	
	
}
