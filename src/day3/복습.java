package day3;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제)숫자를 계속 입력받다가 0이 입력되면 '끝'을 출력
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.print("숫자입력> ");
			int num = sc.nextInt();
			if (num == 0) {
				check = false;  //false를 찍게되면 조건문 한번 더 확인하지만 break;를 쓰게 되면 
			}					//조건문을 끝낸다
		}
		System.out.println("끝");

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int num = sc.nextInt();
//		System.out.println(num);

	}
}
// 1~100까지의 홀수합
//		int i=1;
//		int sum=0;
//		while(i <=100 ) {
//			if(i % 2 != 0) {
//				sum=sum+i;
//						
//			}i++;
//		}
//		System.out.println(sum);
//		}
//		

// int sum = 0; //for문으로 1~100까지 짝수의 합
//		for(int i=1; i<=100; i++) {
//			if(i%2==0) {
//				sum=sum+i;
//			}
//		}System.out.println(sum);
//	}

//		int sum;
//		for(int i = 0; i<10; i++){
//			sum=19
//	}
//			system.out.println(sum)  <--잘못됨 sum을 선언만하고 값을 대입하지 않으면 안된다
//									  <== for문 안에서 생선된 변수는 밖에서 값을 출력 못함