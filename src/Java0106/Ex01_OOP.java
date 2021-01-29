/*
 *Date : 2021.01.06
 *Author: jacob
 *Description: OOP
 *Version: 1.0
 */
package Java0106;

public class Ex01_OOP {

	public static void main(String[] args) {
		/*
		  - 객체지항프로그래밍 
		  -OOP(Object-Oriented-programming) 
		  : 프로그래밍 하기 위해 단위블럭(객체) 단위로 잘게 나누어서 코딩
		  : 다시 객체들을 조립해서 복잡한 프로그램을 만다는 것
		  
		 - 객체지향 : 객체(클래스)라는 작은 단위로 프로그래밍을 한다는 의미 
		 	ex) 뷔페에서 내가 원하는 음식을 가져와서 먹는 것 - 객체지향
		 단점 : 불필요한 메모리를 사용할 수 있음
		 
		 
		 - 절차지향 : 순서대로 진행되는 프로그램 
		 ex) 급식소에서 줄서서 음식을 받는것
		 
		 
		 - 클래스와 객체 
		 
		 - (1) 클래스 : 설게도 객체를 정의해 놓은 것, 객체를 만들기 위한 것
		  				ex) 토스트 레시피
		 - (2)객체(Object) : 다른 것과 식별이 가능한 것 자신만의 고유한 특성과 행동을 가지며
		    				다른 객체들과 상호작용을 한다. 
		   					클래스 안에서인스턴스(instance)라고도 한다. 
		   					ex) 토스트, 스마트폰
		 
		 - (3) 클래스 3요소
		 	
		 	1)필드field)
		 		-명사형
		 		-맴버변수라고 불림
		 		-값의 상대를 관리
		 		-데이터를 저장하는 공간
		 		String name = "박태용";
		 		int age = 27;
		 		
		 	2) 메소드(method)
		 		-동사형
		 		-특정 기능을 정의한 블록
		 		-매개변수 있을수도 없을수도 있다.
		 		-메소드 호출되면 자신이 가지고 있는 기능을 수행한다.
		 		-기능 수행이 끝나면 리턴값이 존재한다.
		 		(리턴값은 메소드의 데이터타입과 일치해야한다.)
		 		-매개변수 : 몇개의 변수 사이에 함수관계를 정과를 정하기 위해 사용되는 또 하나의 변수
		 		 
		 		- 데이터타입			- 메소드이름(){내용}<-실행
		 		 
		 		 void>>return값 x 	method1(){}
		 		 int>>return값o 		method2(){}>>return값 메소드 값
		 		 String>>return값 o	method3(){}>>return값 메소드 값
		 		 boolean>>return값o	method(){}>>return값 메소드 값
		 		 
		 		 int method2(){
		 		 .........
		 		 return 2;
		 		 }
		 		 
		 		 int method2()=> 2
		 		 	System. out.print(method2());
		 		 	==> 2/
		 		 	
		 		 	System.out.print(method2());
		 		 	}
		 		 
		 	3) 생성자(constructor)	
		 		-객체를 만들 때 따라야 하는 규칙을 정의
		 		-객체 생성을 도와주는 블록
		 		-객체 생성시 필요한 매개변수를 규정함
		 		-매개변수가 있을 수도 없을 수도 있다.
		 		-매개변수가 없으면 : 기본생성자
		 		-생성자의 이름은 클래스 이름과 동일
		 
		 
		 */

	}

}
