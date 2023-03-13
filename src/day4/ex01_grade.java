package day4;

import java.util.Scanner;

public class ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("======성적=====");
			System.out.println("이름을 적으시오> ");
			String name = sc.next();
			System.out.println("국어점수 입력> ");
			int kor = sc.nextInt();
			System.out.println("영어점수 입력> ");
			int eng = sc.nextInt();
			System.out.println("수학점수 입력> ");
			int mat = sc.nextInt();
			int total = kor + eng + mat;
			double avg = total / 3f; // 3f=3.0
			char grade = ' '; // char는 작은따움표를 쓰고 안에는 띄어쓰기라도 넣어야한다

			if (avg >= 90) {
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';
			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}

			System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", name, kor, eng, mat, total, avg, grade);
			// %d(decimal)=숫자 , %s=문자열 %f = 실수 %c = 문자 // f앞에 .2를 찍으면 소수점 둘째자리까지 나온다
			System.out.println("\n다시입력(Y/y) ");
			String reStart = sc.next();
			if ((reStart.equals("Y") || reStart.equals("y"))) {
				System.out.println("다시 입력해주세요 ");
				continue;
			} else {
				System.out.println("끝");
				break;
			}
		}
	}
}
