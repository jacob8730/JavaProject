package Java1229;

import java.util.Scanner;

public class Ex09_ScExam {

	public static void main(String[] args) {
		// 이름, 주소(동까지), 연락처, 학교, 전공
		//취미, 특기
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		String addr;
		String number;
		String scho;
		String clas;
		String play;
		String pla;
		
		System.out.print("이름을 입력하세요>>");
		name = sc.next();
		
		System.out.print("주소를 입력하세요(동까지)>>");
		addr = sc.next();
		
		System.out.print("연락쳐를 입력하세요>>");
		number = sc.next();
		
		System.out.print("학교를 입력하세요>>");
		scho = sc.next();
		
		System.out.print("전공를 입력하세요>>");
		clas = sc.next();
		
		System.out.print("취미를 입력하세요>>");
		play = sc.next();
		
		System.out.print("특기를 입력하세요>>");
		pla = sc.next();
		
		System.out.println();
		System.out.println("======출력======");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 주소 : " + addr);
		System.out.println("입력한 연락처 : " + number);
		System.out.println("입력한 학교 : " + scho);
		System.out.println("입력한 전공 : " + clas);
		System.out.println("입력한 취미 : " + play);
		System.out.println("입력한 특기 : " + pla);
		
	}

}
