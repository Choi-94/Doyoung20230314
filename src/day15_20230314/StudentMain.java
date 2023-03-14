package day15_20230314;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDTO studentDTO1 = new StudentDTO();
		        
		Map<Integer,String> map1 = new HashMap<>();
		
		System.out.println("번호(id)\t학번\t이름\t전공\t전화번호\t\t");
		
		studentDTO1.setStudentNumber(1111);
		studentDTO1.setStudentName("이순신");
		studentDTO1.setStudentMajor("컴공");
		studentDTO1.setStudentMobile("010-1111-1111");
		map1.put(1,studentDTO1.toString());
		
		studentDTO1.setStudentNumber(2222);
		studentDTO1.setStudentName("홍길동");
		studentDTO1.setStudentMajor("영어과");
		studentDTO1.setStudentMobile("010-2222-2222");
		map1.put(2,studentDTO1.toString());
		
		
		studentDTO1.setStudentNumber(3333);
		studentDTO1.setStudentName("세종대왕");
		studentDTO1.setStudentMajor("국문과");
		studentDTO1.setStudentMobile("010-3333-3333");
		map1.put(3, studentDTO1.toString());
		
		
		
		for(int key : map1.keySet()) {
			System.out.println(key+"\t"+map1.get(key));
		}
		
		
	}

}

  


