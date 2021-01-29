/*
 	Date : 2020.12.28
 	Author : inchoriya
 	Description : 변수(variable) 
 	Version : 1.0 
 */

package Java1228;

public class Ex01_variale {

	public static void main(String[] args) {
		
				// 변수(variable)
				// : 프로그램 실행에 필요한 데이터를 저장하기 위해
				//   메모리 공간을 할당하고, 이름을 부여한 것
				
				// var number = 1;
				// [데이터타입] [변수이름] = [변수값];
				
				int num = 1;
				// 뒤에 있는 변수값이 변수명 안에 저장된다.
				// num이 1이 아니라, 1의 값이 num에 저장된다.
				
				int age = 30;
				
				System.out.println(age);
				System.out.println("제 나이는 " + age + "살 입니다.");
				
				// 변수명
				// (1) 영문과 숫자, 특수문자중에 _(언더바)와 $(달러표시)만 사용가능
				// (2) 숫자로 시작할 수 없다.
				// (3) 자바에서 이미 사용중인 예약어는 사용할 수 없다.
				// (4) 카멜표기법(낙타) : numberOfStudent
				// 					: 소문자로 시작하고, 다른뜻의 단어가 등장할 때 대문자 사용
				
				
				int number1 = 1;
				int _number = 2;
				int $number = 3;
				
				// int 4number = 4;
				// int int = 5;
				// int public = 6;
				
				
				
				/*
				 	// 컴퓨터 언어 : 0과 1로 이루어진 언어
				 	// 최소단위 bit
				 	// 8bit = 1byte (ex.01010111)
				 	
				 	※데이터 타입 : 정수형, 문자형, 실수형, 논리형 4가지!
				 	
				 	
				 			정수형	문자형	실수형	  논리형
				 	1byte	byte	  -		  -		boolean
				 	2byte	short	char	  -		   -
				 	4byte	int		  -		float      -
				 	8byte	long	  -		double	   -
				 	            >> String / char 대신 많이 사용함
				 	
				 	- 정수형
				 	byte  : (-2^7) ~ (2^7)-1			:: -128 ~ 127
				 	short : (-2^15) ~ (2^15)-1			:: -32768 ~ 32767
				 	★int  : (-2^31) ~ (2^31)-1			:: -2147483648 ~ 2147483647
				 	long  : (-2^63) ~ (2^63)-1          :: 엄청 큼;;;;;;;;;; 
				  
				 */
					
				byte byte1 = -128;
				byte byte2 = 127;
				// byte byte3 = -129;
				// byte byte4 = 128;
				
				short short1 = -32768;
				short short2 = 32767;
				// short short3 = -32769;
				// short short4 = 32768;
				
				// int(integer)
				int int1 = -2147483648;
				int int2 = 2147483647;
				// int int3 = -2147483649;
				// int int4 = 2147483648;
				
				// long을 사용할 때는 숫자 뒤에 L을 붙여준다.
				long int3 = -2147483649L;
				long int4 = 2147483648L;
				
				// 문자형(character)
				char char1 = 'a';
				char char2 = 'A';
				char char3 = '가';
				char char4 = '!';
				
				// 실수형 : 소숫점을 포함한 숫자( float, double )
				double d1 = 3.14;
				double d2 = -3.14;
				
				// float는 숫자 뒤에 f를 붙여준다.
				float f1 = 3.14f;
				float f2 = -3.14f;
				
				boolean bool1 = 5>3;
				System.out.println("bool1 : " + bool1);
				

	}

}
