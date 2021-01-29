package Java1228;

public class Ex02_variable2 {
	
public static void main(String[] args) {
		
		// 변수 선언 + 변수 초기화
		// [데이터 타입] [변수명] = [변수값];
		
		// 1. 변수 선언 
		// [데이터타입] [변수명];
		int age;
		// 2. 변수 초기화
		// [변수명] = [변수값];
		age = 30;
		//System.out.println(age);
		
		age = 20;
		//System.out.println(age);
		
		// 같은 데이터 타입 변수값 선언
		int age1 = 30, age2 = 20, age3 = 10;
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		
		// 한줄 복사
		// 1. [Home]버튼이나 [End]버튼을 누른다
		// 2. [Shift]버튼을 누른 후 [End], [Home]을 누른다.
		// 3. [Ctrl] + [C]로 복사
		// 4. [Ctrl] + [V]로 붙여넣기
		
		System.out.println("age1+age2 = " + (age1+age2));	// 50
		System.out.println("age1-age3 : " + (age1-age3));	// 20

		// 구분선
		System.out.println("===================================");
		
		char ch1;
		ch1 = 'A';
		System.out.println("A");		// A
		System.out.println(ch1);		// A
		System.out.println((int)ch1);	// 65
		// A라는 문자는 숫자 65로 표현가능
		
		// Q. 'a'와 'B'는 어떤 숫자로 표현이 가능한가?
		System.out.println((int)'a');	// 97
		System.out.println((int)'B');	// 66
		
		// 아스키코드
		// Q.한글도 아스키코드로 표현이 가능한가?
		// 본인 이름을 아스키코드로 바꿔보아라.
		
		char ch2 = '황';
		char ch3 = '인';
		char ch4 = '철';
		
		System.out.println((int)ch2);		//54889
		System.out.println((int)ch3);		//51064
		System.out.println((int)ch4);		//52384
		
		int num1 = 54889;
		int num2 = 51064;
		int num3 = 52384;
		
		// Q. 아스키코드(숫자)를 가지고 본인 이름 출력하기!
		System.out.println((char)num1);
		System.out.println((char)num2);
		System.out.println((char)num3);


		
		
		

	}

}
