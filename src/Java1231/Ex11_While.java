/*
 *Date : 2020.12.31
 *Author: jacob
 *Description: 반복문 while
 *Version: 1.0
 */
package Java1231;

public class Ex11_While {

	public static void main(String[] args) {
		// while문 : 반복조건 true일 경우 게속해서 반복
		// : 반복조건이 false일 경우 멈춤

		/*
		  while(반복조건){
		  
		  	수행문
		 
		  }
		 */

		int i = 1;
		int sum = 0;
		while (i <= 10) { // i가10보다 작거나 같을 경우 반복
			System.out.println("i : " + i);
			sum += i;

			System.out.println("sum : " + sum);
			System.out.println();
			i++;
		}

	}

}
