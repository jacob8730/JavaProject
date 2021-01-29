/*
 *Date : 2020.12.30
 *Author: jacob
 *Description: 조건문(Condition) if
 *Version: 1.0
 */
package Java1230;

public class Ex02_Condition {

	public static void main(String[] args) {
		// 만약에 늦잠을 잤다면
		// 지각이다.
		// 그렇지 않다면 (늦잠을 자지 않았다면)
		// 지각이 아니다. 수업을 들을 수 있다.
		
		/*
		 * 만약(늦잠을 잤다면){
		 * 지각이다
		 * }그렇지않다면{
		 * 지각이 아니다.
		 * }
		 */
		/*
		 * if(조건식){
		 * 조건이 참일 경우에 이 문장을 실행
		 * } else{
		 * 조건이 거짓일 경우 이 문장을 실행
		 * }
		 * 조건식 : boolean 타입이어야 한다.
		 */
		
		boolean condition = true;
		if(condition) {
			System.out.println("조건만족");	//condition = true
		}else {
			System.out.println("조건불만족");	//condition = false
		}
		// if : 만약에
		// else : 그렇지 않다면
		
		int num1 = 5;
		int num2 = 3;
		
		if(num1>num2) {
			System.out.println("num1이 크다");
			}else {
				System.out.println("num2가 크다");
			}
		int age = 10;
		
		//Q. 나이가 8살 이상이면 학교에 다닙니다.
		//	그렇지 않다면 학교에 다니지 않습니다.
		
		if(age>=8) {
			System.out.println("학교에 다닌다.");
		}else {
			System.out.println("학교에 다니지 않는다");
		}
		
	}

}
