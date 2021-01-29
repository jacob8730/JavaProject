/*
 *Date : 2021.01.05
 *Author: jacob
 *Description: 2차원 배열(TwoDimensional Array)
 *Version: 1.0
 */
package Java0105;

public class Ex07_TDArray {

	public static void main(String[] args) {
		// 2차원 배열
		// 데이터타입 배열이름[][] = new int[i][j];

		int arrNum1[][] = new int[2][3];

		System.out.println("arrNum1의 배열크기 : " + arrNum1.length);
		System.out.println("arrNum1[i]의 배열크기 : " + arrNum1[0].length);
		System.out.println("arrNum1[i]의 배열크기 : " + arrNum1[1].length);

		arrNum1[0][0] = 1;	arrNum1[0][1] = 2;	arrNum1[0][2] = 3;
		arrNum1[1][0] = 4;	arrNum1[1][1] = 5;	arrNum1[1][2] = 6;

		for (int i = 0; i < arrNum1.length; i++) {
			for (int j = 0; j < arrNum1[i].length; j++) {
				System.out.print("arrNum1[" + i + "][" + j + "]" + arrNum1[i][j]);
			}
		}

	}

}
