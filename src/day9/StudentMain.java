package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		List<Student> list = new ArrayList<>();

		while (true) {
			System.out.println("=====학사관리시스템=====");
			System.out.println("1.학생등록 2.리스트 3.검색 4.수정 5.삭제 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				Student student = new Student();
				System.out.print("이름> ");
				student.setName(sc.next());
				System.out.print("국어점수> ");
				student.setKor(sc.nextInt());
				System.out.print("영어점수> ");
				student.setEng(sc.nextInt());
				System.out.print("수학점수> ");
				student.setMat(sc.nextInt());
				student.setTotal();
				student.setAvg();
				student.setGrade();
				list.add(student);
				System.out.println(student.getName() + "학생이 등록되었습니다");

			} else if (menu == 2) {
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("-------------------------------------------------");
				for (Student s : list) {
					s.print();
				}
			} else if (menu == 3) {
				System.out.print("검색하실 학번을 적어주세요> ");
				String sno = sc.next();
				boolean find = false;
				for (Student s : list) {
					if (sno.equals(s.getSno())) {
						System.out.println(s.getName() + "님의 정보입니다");
						System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
						s.print();
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("찾을 수 없는 학번입니다");
				}
			} else if (menu == 4) {
				System.out.print("수정하실 학번을 적어주세요> ");
				String updateSno = sc.next();
				boolean find = false;
				for (Student s : list) {
					if (updateSno.equals(s.getSno())) {   //==은 스텍변수에 저장된 값(주소)을 비교 equals는 참조값을 비교할때 쓴다
						System.out.print("수정할 이름> ");
						String updateName = sc.next();
						s.setName(updateName);
						System.out.print("수정할 국어점수> ");
						int updateKor = sc.nextInt();
						s.setKor(updateKor);
						System.out.print("수정할 영어점수> ");
						int updateEng = sc.nextInt();
						s.setEng(updateEng);
						System.out.print("수정할 수학점수> ");
						int updateMat = sc.nextInt();
						s.setMat(updateMat);
						s.setTotal();
						s.setAvg();
						s.setGrade();
						System.out.println(s.getName() + "님 수정이 완료 되었습니다");
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("학번을 찾을 수 없습니다");
				}
			} else if (menu == 5) {
				System.out.print("삭제할 학번> ");
				boolean find = false;
				String deleteSno = sc.next();
				for (Student s : list) {
					if (deleteSno.equals(s.getSno())) {
						System.out.println(s.getName() + "가 삭제되었습니다");
						list.remove(s);
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("찾을 수 없는 학번입니다");
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
