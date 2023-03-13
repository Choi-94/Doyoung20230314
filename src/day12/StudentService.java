package day12;

import java.util.List;
import java.util.Scanner;

import day10_2.Student;

public class StudentService {
	StudentRepository repository = new StudentRepository();
	Scanner sc = new Scanner(System.in);
	
	public void save() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름> ");
		studentDTO.setName(sc.next());
		System.out.print("국어> ");
		studentDTO.setKor(sc.nextInt());
		System.out.print("영어> ");
		studentDTO.setEng(sc.nextInt());
		System.out.print("수학> ");
		studentDTO.setMat(sc.nextInt());
		studentDTO.setGrade();
		
		boolean loginOk = repository.save(studentDTO);
		if(loginOk) {
			System.out.println("등록 성공!");
		}else {
			System.out.println("등록 실패!");
		}
	}
	public void findAll() {
		List<StudentDTO> list = repository.findAll();
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------------------");
		for(StudentDTO s : list) {
			System.out.println(s.toString());
		}
		
	}
	public void findById() {
		System.out.print("조회하실 학번을 입력해주세요> ");
		String sno = sc.next();
		repository.findById(sno);
		
		StudentDTO studentDTO = repository.findById(sno);
		if(studentDTO == null) {
			System.out.println("조회할 수 없는 학번입니다");
		}else {
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("-----------------------------------------------------------");
			System.out.println(studentDTO.toString());
		}
	}
	public void update() {

		
		
		System.out.print("업데이트하실 학번을 입력해주세요> ");
		String sno = sc.next();
		StudentDTO s = repository.findById(sno);
		if(s == null) {
			System.out.println("조회할 수 없는 학번입니다");
		}else {
			System.out.print("새로운 국어점수> ");
			s.setKor(sc.nextInt());
			System.out.print("새로운 영어점수> ");
			s.setEng(sc.nextInt());
			System.out.print("새로운 수학점수> ");
			
			
			s.setMat(sc.nextInt());
			s.setGrade();
			repository.update(s, sno);
		}
		
		if(repository.update(s,sno)) {
			System.out.println("업데이트에 성공하였습니다");
		}else {
			System.out.println("업데이트에 실패하였습니다");
		}		
	}
	public void delete() {
		System.out.print("학생정보를 삭제할 학번을 입력하시오> ");
		String sno = sc.next();
		StudentDTO s = repository.findById(sno);
		if(s == null) {
			System.out.println("조회할 수 없는 학번입니다");
		}if(repository.delete(sno)) {
			System.out.println("입력하신 학번의 학생정보를 삭제하였습니다");
		}else {
			System.out.println("삭제에 실패하였습니다");
		}
		
	}
}
