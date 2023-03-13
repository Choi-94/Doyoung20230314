package day3;

import java.util.Scanner;

public class 프토젝트_복합기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("돈 > ");
		long money = sc.nextInt();
		while(true) {
			System.out.println("==== 복합기 =====\t현재잔액: "+money+"원");
			System.out.println("1.인쇄기 2.스캐너 3.팩스 0.종료");
			System.out.print("메뉴선택>");
			int p = sc.nextInt();
			int sum = 0;
			if(p == 1) {
			    while(true) {
			        System.out.println("1.흑백(1000원), 2.칼라(1500원)");
			        int choice = sc.nextInt();
			        if(choice == 1) {
			            System.out.println("수량입력 > ");
			            int num = sc.nextInt();
			            sum = num * 1000;
			            System.out.println("가격은"+sum+"입니다.");
			            break;
			        } else if (choice == 2) {
			            System.out.println("수량입력 > ");
			            int num = sc.nextInt();
			            sum = num * 1500;
			            System.out.println("가격은"+sum+"입니다.");
			            break;
			        } else {
			            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			        }
			    
			}
				money = money - sum;
				
			}else if (p == 2) {
				System.out.println("1.흑백(1000원), 2.칼라(1500원)");
				p = sc.nextInt();
				if(p == 1) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1000;
					System.out.println("가격은"+sum+"입니다.");
				}else if(p ==2) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1500;
					System.out.println("가격은"+sum+"입니다.");
				}
				money = money - sum;
				System.out.print("메뉴선택>");
				p = sc.nextInt();
			}else if (p == 3) {
				System.out.println("1.흑백(1000원), 2.칼라(1500원)");
				p = sc.nextInt();
				if(p == 1) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1000;
					System.out.println("가격은"+sum+"입니다.");
				}else if(p ==2) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1500;
					System.out.println("가격은"+sum+"입니다.");
				}
				money = money - sum;
				System.out.print("메뉴선택>");
				p = sc.nextInt();
			}else if (p == 0) {
				money = money - 1500;
				System.out.println("우유 구입성공!");
//			}else if (1~3) {
//			
//					System.out.println("종료");
//					break;
//			}else {
//				System.out.println("0~3까지 번호를 똑바로 입력하세요");
//			
//			}
		}
	}
}
}