/*
 *Date : 2021.01.04
 *Author: jacob
 *Description: 배열(Array)
 *Version: 1.0
 */
package Jave0104;

public class Ex05_Array {

	public static void main(String[] args) {
		// 배열(Array) : 같은 데이터 타입의 데이터를 하나의 변수에 저장하는 구조
		// ex) 코틀린반 이름으로 묶은 데이터의 집합

		// 배열선언 방법
		// 1) 데이터타입 [] 배열이름
		// 2) 데이터타입 배열이름[]
		int[] num1;
		int num2[];

		// 배열 선언 후 값 목록을 저장할 경우 new 연산자를 사용하여 목록을 지정한다.
		num1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };// 배열
		System.out.println("첫번째 방 : " + num1[0]);
		System.out.println("두번째 방 : " + num1[1]);
		System.out.println("일곱번째 방 : " + num1[6]);// 인덱스
		System.out.println();

		// 배열을 선언하면서 값을 주기
		int num3[] = { 10, 20, 30, 40 };
		System.out.println("1번방 : " + num3[0]);
		System.out.println("4번방 : " + num3[3]);

		// 배열의 크기(길이) 구하기
		// length

		int lNum3 = num3.length;
		System.out.println("num3[] 배열의 길이 : " + lNum3);

		// int num =0;
		// 배열 초기화 (1), (2)
		int a[] = null;
		int b[] = {};

		// 배열타입에 맞춰 값 입력
		char ch[] = { 'A', 'b', '훈', '짱' };
		String str[] = { "인덱스0", "인덱스1", "인덱스2", "인덱스3" };

		System.out.println("0번 인덱스에 저장된 str[0]의 값 : " + str[0]);

		// 정수형 배열 socres[] 선언해서 값4개 저장
		int scores[] = { 100, 95, 90, 90 };

		// Q1.for문을 사용해서 배열의 값을 출력하시오.

//		for(int i = 0; i<scores.length; i++) {// i = 0~3 (4번 반복)
		// scores.length = 4
		// i : 인덱스번호, scores[i] : 배열값
//			System.out.println("scores[" + i + "] = " + scores[i]);
//		}

		// Q2.배열에 저장된 값의 총점과 평군을 구하시오.(평균 구할 시 scores.length 사용)

		int sum = 0;
		double avg = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
			sum += scores[i]; // sum += scores[i]
		} // sum = sum + scores[i]
		avg = (double) sum / scores.length;
		// sum = 375.0 => 강제로 int타입에서 double타입으로 변형
		System.out.println("총점 : " + sum + "평균 : " + avg);
		System.out.println();

		int arr[] = new int[3];
		System.out.println("arr배열의 크기 : " + arr.length);// 3

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		arr[0] = 5;
		arr[1] = 7;
		arr[2] = 100;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}

}
