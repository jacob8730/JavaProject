/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 구구단 만들기
 *Version: 1.0
 */
package Java1231;

import java.util.Scanner;

public class Ex08_MultiTable {

	public static void main(String[] args) {
		//

		Scanner sc = new Scanner(System.in);
		
		//구구단 가로8 세로9
//		for (int i = 2; i <= 9; i++) {	//가로8
//			for (int j = 1; j <= 9; j++) {	//세로9
//				System.out.print(i + "x" + j + "=" + (i * j));
//				System.out.print("\t");
		// System.out.print("\n"); // 밑으로 줄 띄우기
		// System.out.print("\t"); // 옆으로 줄 띄우기
//			}
//			System.out.print("\n");
//		}
		
		//구구단 가로 9 세로 8
		for (int i = 1; i <= 9; i++) {	//가로9
			for (int j = 2; j <= 9; j++) {	//세로8
				System.out.print(j + "x" + i + "=" + (j * i));
				System.out.print("\t");
				// System.out.print("\n"); // 밑으로 줄 띄우기
				// System.out.print("\t"); // 옆으로 줄 띄우기
			}
			System.out.print("\n");
		}

	}

}
