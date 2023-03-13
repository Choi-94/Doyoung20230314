package day5;

import java.util.Scanner;

public class 숙제_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 배열 num의 값을 앞으로 한칸씩 당기시오
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num9 = num.length;
		for (int i = num.length - 1; i >= 0; i--) {
			if (i > 0) {
				num[i] = num[i - 1];
			} else {
				num[0] = num9;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
