package day5;

import java.util.Scanner;

public class 배열예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int j = 0;
	
		while(true) {
	
			System.out.println("숫자입력> ");
			int number = sc.nextInt();
			if (number % 2 == 0) {
				num[j] = number;
				j++;
			}
			if(j == 10) {
				break;
			}
		}for(int i =0; i<num.length; i++) {
			System.out.println(num[i]);
		}

//		for (int i = 0; i < num.length; i++) {
//			System.out.println("숫자입력> ");
//			int number = sc.nextInt();
//			if (number % 2 == 0) {
//				num[i] = number;
//			} else {
//				i--;
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}

	}

}
