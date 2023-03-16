package day17_20230316;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SchoolService service = new SchoolService();

		System.out.println("==============OO초등학교 학생관리 시스템==================");
		while (true) {
			System.out.println("1.학생등록 2.모든학생리스트 3.학생정보수정 4.학생찾기 5.학생삭제 6.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				service.save();
			} else if (menu == 2) {
				service.studentlist();
			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else if (menu == 6) {

			} else {
				System.out.println("찾을 수 없는 항목입니다");
			}
		}
	}
}
