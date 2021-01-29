/*
 *Date : 2021.01.05
 *Author: jacob
 *Description: 배열값 찾기(ArraySearch)
 *Version: 1.0
 */
package Java0105;

import java.util.Scanner;

public class Ex02_ArraySearch {

	public static void main(String[] args) {
		// 배열에서 특정한 값이 몇번 인덱스에 있는지 찾아보자

		int num[] = { 8, 2, 6, 1, 9, 3, 4, 10, 7, 5 };

		int value;
		int index;

		Scanner sc = new Scanner(System.in);

		System.out.print("1부터 10사이의 숫자입력 >>");
		value = sc.nextInt();

		for (int i = 0; i < num.length; i++) {

			if (value == num[i]) {
				index = i + 1;
				System.out.println(value + "는(은)" + index + "번째 위치합니다.");
			}

		}

	}

}
