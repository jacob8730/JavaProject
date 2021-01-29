/*
 *Date : 2020.12.30
 *Author: inchoriya
 *Description: 중첩if문(NestedIf)
 *Version: 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex05_Example {

	public static void main(String[] args) {
		// 국어, 영어, 수학  점수를 입력 받아서
		//총점(sum), 평균(avg)을 구한다.
		//평균점수가
		//100~95 : A+
		//94~90 : A
		//89~85 : B+
		//84~80 : B
		//79~75 : C+
		//74~70 : C
		//69~65 : D+
		//64~60 : D
		//그외에 : F
		//단 100전을 초과하면 '입력범위 초과' 가 출력되도록
		
		//총점은 000점, 평균은 000점, 학점은 00입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int kor, math, eng;
		int sum; 
		double avg;
		String grade="";
		
		System.out.print("국어점수?");
		kor = sc.nextInt();
		System.out.print("수학점수?");
		math = sc.nextInt();
		System.out.print("영어점수?");
		eng = sc.nextInt();
		
		//총점
		sum = kor + math + eng;
		//평균
		avg = sum /3;
		
		if(avg <= 100) {
			if(avg >=90) {
				if(avg >=95) {
					grade = "A+";
				}else {
					grade = "A";
				}
				}else if(avg >= 80) {
					if(avg >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
				}else if(avg >= 70) {
					if(avg >= 75) {
					grade = "C+";
				}else {
					grade = "C";
				}
				}else if(avg>=60) {
					if(avg >= 65) {
					grade = "D+";
				}else{
					grade = "D+";
				}
				}else {
					grade = "F";
				}
			}
			System.out.println("총점 " + sum);
			System.out.println("평균 " + avg);
			System.out.println("학점 " + grade);
	
	}

}
