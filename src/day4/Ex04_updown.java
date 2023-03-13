package day4;

import java.util.Scanner;

public class Ex04_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 숫자를 계속 입력받으면서 정답을 맞추는 게임
		// 정답이 입력받은 숫자보다 크면 up출력
		// 정답이 입력받은 숫자보다 작으면 down출력
		// 정답을 맞추면 정답! 출력 후 반복문 out

		Scanner sc = new Scanner(System.in);
		double answer = (int) (Math.random() * 31) + 1;
		System.out.println(answer);
		boolean check = true;
		int a = 0;

		while (check) {
			a++;
			System.out.println("정답을 입력해주세요");
			int num = sc.nextInt();
			if(a==10) {
				System.out.println("정답입니다");
				break;
			}
			if (a < 10) {

				if (num > answer) {
					System.out.println("DOWN");
					
					continue;
				} else if (num < answer) {
					System.out.println("up");
					
					continue;
				} else {
					System.out.println("정답입니다");
					System.out.println(a + "번 시도했습니다");
					check = false;
					if (a < 3) {
						System.out.println("perfect");
					} else if (a < 5) {
						System.out.println("good");
					} else if (a < 10) {
						System.out.println("normal");
					}

				}

			
			}
		}
	}
}

//if (a == 10) {
//System.out.println("game over");
//break;    --<이걸 위에다가 주면 10번째 정답이 안됨