package day9;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[20];

		for (int i = 1; i <= num.length - 1; i = i + 2) {
			num[i] = i;
			System.out.print(num[i] + " ");

		}
		System.out.println();
		for (int i = 3; i <= num.length - 1; i = i + 2) {
			num[i] = i;
			System.out.println(num[i] + " ");

		}
		System.out.println();

		for (int j = 0; j < num.length; j = j + 2) {

			num[j] = j + 2;

			System.out.println(num[j] + "  ");
		}
		System.out.println();
	}
}