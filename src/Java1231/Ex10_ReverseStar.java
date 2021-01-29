/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 별찍기 역순
 *Version: 1.0
 */
package Java1231;

public class Ex10_ReverseStar {

	public static void main(String[] args) {
		// ***** 	//5줄 : 5개
		// **** 	//4줄 : 4개
		// *** 		//3줄 : 3개
		// ** 		//2줄 : 2개
		// * 		//1즐 : 1개

		// 5줄>>>>1줄
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
