package day5;

import java.util.Scanner;

public class dddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 배열 num의 값을 앞으로 한칸씩 당기시오
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num9 = num[num.length-1];
		int temp = num[0];
		for (int i = 0; i <= num.length - 1; i++) {
			if (i == 0) {
				num[0] = num9;
				
			}
			else if (i >= 1) {
				num[i] = num[i - 1];
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
