/*
 *Date : 2021.01.04
 *Author: jacob
 *Description: 반복문 do~while
 *Version: 1.0
 */
package Jave0104;

public class Ex02_Dowhile {

	public static void main(String[] args) {
		/*
		 
		 
		 	do{
		 	
		 		반복실행 내용
			
		 		}while(조건식)
		 
		 
		 
		 	while문과 do-while문의 차이점
		 	1)while문은 반복문을 실행하기 전에 조건식을 검사한다.
		 	2)do-while문은 반복문을 실행하고 조건식을 검사한다.
		 	  무조건 반복문 한번은 실행이 된다.
		 
		 */
		
		int i = 10;
		 System.out.println("while문");
		 //while문
		 while(i<11) {
			 System.out.println("while i값 : " + i);
			 i++;
		 }
		 
		 int j =10;
		 //do-while
		 System.out.println("do-while문");
		 do {
			 System.out.println("do-while문  j값 :" +j);
			 j++;
		 }while(j<11);
		 

	}

}
