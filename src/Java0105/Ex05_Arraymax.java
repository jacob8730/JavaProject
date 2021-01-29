/*
 *Date : 2021.01.05
 *Author: jacob
 *Description: 배열최댓값(ArrayMax)
 *Version: 1.0
 */
package Java0105;

import java.util.Scanner;

public class Ex05_Arraymax {

	public static void main(String[] args) {
		// 배열의 크기가 5인 배열을 선언
		// 스캐너를 이용하여 값 5개를 입력
		// 입력한 값 중 가장 큰 값을 구하는 문제

		int arr[] = new int[5]; // 배열크기 지정
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int num = 0;
		System.out.println("숫자" + arr.length + "개를 입력해주세요.");

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i + 1) + "번째 숫자입력>>");
			arr[i] = sc.nextInt();

			System.out.println("입력받은 숫자는 arr[" + "] = " + arr[i]);

			// 첫번째 방법
//			if(arr[i] > max) {
//				max = arr[i];
//			}
			
			
			/*
			  arr[0] > 0 비교 후 큰 값이 max
			  max 랑 arr[1] 비교 후 큰 값이 max
			  max 랑 arr[2] 비교 후 큰 값이 max 
			  max 랑 arr[3] 비교 후 큰 값이 max 
			  max 랑 arr[4] 비교 후 큰 값이 max 
			  max 랑 arr[5] 비교 후 큰 값이 max 			   
			 */
			
			

			// 두번째 방법
			max = (arr[i] > max) ? arr[i] : max;
			// arr[i]가 크면 max = arr[i]
			// arr[i]가 작으면 max = max;

		}

		System.out.println("가장 큰 수는" + max + "입니다.");

	}

}
