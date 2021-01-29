/*
 *Date : 2021.01.05
 *Author: jacob
 *Description: 배열복사(ArrayCopy)
 *Version: 1.0
 */
package Java0105;

public class Ex04_ArrayCopy {

	public static void main(String[] args) {
		// 특정 실무 제외하고는 잘 사용하지 않음

		String kotlin1[] = { "홍길동", "김길동", "이길동", "박길동", "최길동" };
		String kotlin2[] = new String[5];

		// kotlin1[0] = 홍길동 		//kotlin2[0] = null
		// kotlin1[1] = 김길동 		//kotlin2[1] = null
		// kotlin1[2] = 이길동 		//kotlin2[2] = null
		// kotlin1[3] = 박길동 		//kotlin2[3] = null
		// kotlin1[4] = 최길동 		//kotlin2[4] = null

		// System.arraycopy(src, srcPos, dest, destPos, length);
		
		// src = 복사할 배일명, 복사 시작할 인덱스 번호, 붙여넣기할 배일명, 붙여넣기 시작할 인덱스 번호 ,복사배열 크기

		// kotlin1[0] = 홍길동		 //kotlin2[0] = 홍길동
		// kotlin1[1] = 김길동		//kotlin2[1] = 김길동
		// kotlin1[2] = 이길동 		//kotlin2[2] = 이길동
		// kotlin1[3] = 박길동 		//kotlin2[3] = 박길동
		// kotlin1[4] = 최길동 		//kotlin2[4] = 최길동

		System.arraycopy(kotlin1, 0, kotlin2, 0, kotlin1.length);

		for (int i = 0; i < kotlin1.length; i++) {

			System.out.print("kotlin1[" + "] = " + kotlin1[i]);
			System.out.println("\t" + "kotlin2[" + "] = " + kotlin2[i]);
		}

		// kotlin1[0] = 홍길동 		//kotlin2[0] = 박길동
		// kotlin1[1] = 김길동		//kotlin2[1] = 최길동
		// kotlin1[2] = 이길동 		//kotlin2[2] = 홍길동
		// kotlin1[3] = 박길동 		//kotlin2[3] = 김길동
		// kotlin1[4] = 최길동 		//kotlin2[4] = 이길동

		System.arraycopy(kotlin1, 0, kotlin2, 2, kotlin1.length - 2);
		System.arraycopy(kotlin1, 3, kotlin2, 0, kotlin1.length - 3);

		for (int i = 0; i < kotlin1.length; i++) {

			System.out.print("kotlin1[" + "] = " + kotlin1[i]);
			System.out.println("\t" + "kotlin2[" + "] = " + kotlin2[i]);
		}

	}

}
