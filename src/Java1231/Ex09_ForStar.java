/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 별찍기 예제
 *Version: 1.0
 */
package Java1231;

public class Ex09_ForStar {

	public static void main(String[] args) {
		// 별찍기 예제
		// 중첩for문을 이용해서 만들기

		// *		//1줄 : 1개
		// **		//2줄 : 2개
		// ***		//3줄 : 3개
		// ****		//4줄 : 4개
		// *****	//5줄 : 5개
		
		//입력 방법
//		System.out.print("*");
//		System.out.print("**");
//		System.out.print("***");
//		System.out.print("****");
//		System.out.print("*****");
		
		//5줄
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
				if(j==i) {
					System.out.println();
				}
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
