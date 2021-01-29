/*
 *Date : 2020.12.29
 *Author: inchoriya
 *Description: 대입연산자(assignmentOperation)
 *Version: 1.0
 */
package Java1229;

public class Ex02_AssOperation {

	public static void main(String[] args) {
		//나이를 의미하는 변수 age에 변수값 20을 대입함.
		//lVaule(항상변수) = rValue(상수,변수,식)
		
		//상수대입
		int age = 20;
		System.out.println("상수 대입");
		System.out.println(age);
		
		//변수대입
		int num = 1;
		age = num;
		System.out.println("변수 대입");
		System.out.println(age);
		
		//식 대입
		age = 20 + 1;
		age = 20 + num;
		System.out.println("식 대입");
		System.out.println(age);
		
		//부호연산자 : (+),(-)
		int num1 = 10;
		System.out.println("+num1 : " + (+num1));
		System.out.println("-num1 : " + (-num1));
		System.out.println("num1 : " + (num1));
		
		num1 = -num1;
		System.out.println("num1 : " + (num1));		//-10

	}

}
