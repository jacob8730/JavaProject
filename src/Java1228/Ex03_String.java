package Java1228;

public class Ex03_String {

	public static void main(String[] args) {
		// String타입
		// : char(문자)들의 집합 => 문장의 데이터 타입
				
		// char ch1 = '안녕하세요';
		String str1 = "안녕하세요";
				
		// 문자(char)는 ''(싱글쿼터) 로 표시
		// 문장(String)은 ""(더블쿼터) 로 표시
				
		String result;	// result변수 선언
				
		String str2 = "자바는 ";
		String str3 = "재미있어!";
		String str4 = "너무 어려워!";
				
		result = str2 + str3;
		//System.out.println(result);
				
		result = str2 + "정말 " + str4;
		System.out.println(result);

	}

}
