package day15_20230314;

import java.util.Scanner;

import day11.BoardService;

public class BoardMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		BoardService service = new BoardService();
		
		while(true) {
			System.out.println("======계시판======");
			System.out.println("1.게시판등록 2.리스트 3.읽기 4.수정 5.삭제.0.종료");
			System.out.print("선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				service.save();
			}else if(menu == 2) {
				service.findAll();
			}else if(menu == 3) {
				service.findById();
			}else if(menu == 4) {
				service.update();
			}else if(menu == 5) {
				service.remove();
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
