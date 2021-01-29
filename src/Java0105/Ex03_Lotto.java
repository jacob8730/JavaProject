/*
 *Date : 2021.01.05
 *Author: jacob
 *Description: Lotto(로또번호 생성기)
 *Version: 1.0
 */
package Java0105;

public class Ex03_Lotto {

	public static void main(String[] args) {
		// 배열을 이용해서 로또 번호를 생성해보자
		
		int lotto[] = new int[7];
		//System.out.println("lotto.length : " + lotto.length);//7
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i] = (int)(Math.random() * 45)+1;
			//lotto[0] ~ lotto[6]
			
			//중복값을 제거하는 반복문
			for(int j=0; j<i; j++) {			//전에 뽑은 j(ㅑ-1)랑 지금 뽑은 i랑 비교
				if(lotto[i] == lotto[j]) {		//lotto[i] 0 1 2 3 4 5 6
					i --;						//lotto[j] x 0 1 2 3 4 5
					System.out.println("중복제거 " + lotto[i]);
					break;
				} 
			}
		}
		System.out.println("이번주 로또 당첨번호는");
		for(int k=0; k<lotto.length; k++) {
			if(k<lotto.length-1) {	//6개의 번호
				System.out.print(lotto[k]+" ");
			}else{					// 나머지 1개 번호, 보너스 번호
				System.out.println("보너스 번호" + lotto[k] +"입니다");
			}
		}
	}
}