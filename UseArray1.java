package day0622;

import java.util.Iterator;

/**
 * 1차원 배열의 사용
 * @author USER
 */
public class UseArray1 {
	
	public void arrayUse1() {
		//1.선언) 데이터형[] 배열명=null;
		int[] arr = null;
		//2.생성) 배열명=new 데이터형[방의 수];
		arr = new int[5];
		System.out.println(arr+ "배열의 방의 개수 : " + arr.length);
		//3.값할당) 배열명[방의 번호]=값;
		arr[0] = 10;
		arr[4] = 2023;
		//4.값사용) 배열명[방의번호]
		System.out.println(arr[0] + " / " + arr[1]);
		
		// 일괄처리
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\t", i, arr[i]);
		}
		System.out.println();
	}
	
	public static final int FLAG_SCORE = 83; 
	
	public void arrayUse2() {
		int[] score = /*new int[]가 생략*/ {83,99,77,64,93,70};
		System.out.printf("시험응시자 [%d]명\n", score.length);
		
		// 일괄처리
		System.out.println("번호\t점수");
		System.out.println("=======================");
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번\t%d점\n", i+1, score[i]);
			sum += score[i];
			
		}
		
		avg = sum/score.length;
		System.out.println("=======================");
		System.out.printf("총점[%d], 평균[%.2f]\n", sum, avg);
		System.out.println("=======================");
		
///////////////////////////////////////////////////////////////////////////
		
		//score배열의 마지막 방부터 처음 방까지 출력
		for (int i = score.length-1; i > -1; i--) {
			System.out.printf("score[%d]=%d\n", i, score[i]);
		}
///////////////////////////////////////////////////////////////////////////
	
		//점수 중에 최고 점수를 출력
		int top = score[0];
	
		for (int i = 0; i < score.length; i++) {
			if (top < score[i]) {
				top = score[i];
			} 
		}
		System.out.printf("최고점은 : %d\n", top);
///////////////////////////////////////////////////////////////////////////
		
		int[] score1 = {83,99,77,64,93,70,83,78,83,20};//데이터( 반복시킬 데이터 )
		// 83점과 같은 점수를 받은 학생의 수를 얻기
		// 최고점과 최저점 차이
		int top1 = score[0];
		int bottom = score[0];
		int sameGrade = 0;	
		
		for (int i = 0; i < score1.length; i++) {
			if (score1[0] == score1[i]) {
				sameGrade += 1;
			}
			if (top1 < score1[i]) {
				top1 = score1[i];
			} else if (bottom > score1[i]) {
				bottom = score1[i];
			}
		}	
		System.out.printf("83점과 같은 점수를 받은 학생의 수 : %d, 최고점 : %d, 최저점 : %d\n", sameGrade, top1, bottom);
///////////////////////////////////////////////////////////////////////////
		int[] score2 = {83,99,77,64,93,70,83,78,83,20};//데이터( 반복시킬 데이터 )
		// 83점과 같은 점수를 받은 학생의 수를 얻기
		// 최고점과 최저점 차이
		int bottom1 = 100;
		top = 0;
		int cnt = 0;
		for (int i = 0; i < score2.length; i++) {// 배열의 시작부터 끝까지 반복 시키기 위해서
			switch (score2[i]) {
			case FLAG_SCORE:
				cnt++;
			}
			//최고점
			if (top < score2[i]) {
				top = score2[i];
			}
			//최하점
			if (bottom1 > score2[i]) {
				bottom1 = score2[i];
			}
		}
		System.out.println(FLAG_SCORE + "점과 같은 점수를 받은 학생의 수 " + cnt);
		System.out.println("최고점 " + top + " 최하점 " + bottom1 + " 차 " + (top-bottom1));
//////////////////////////////////////////////////////////////////////////////		
	
		// score를 99 93 83 77 70 64로 내림차순
		int temp = 0;// 배열 방의 값을 임시로 저장
		for (int i = 0; i < score.length; i++) {// 현재 방의 값을 반복
			for (int j = i+1; j < score.length; j++) {// 현재방부터 뒤에 존재하는 방의 값을 반복
				if(score[i] < score[j]) { // 앞방이(i) 뒷방보다(j) 작다면
					temp = score[i];// 앞방의 값을 임시변수에 넣고
					score[i] = score[j];// 뒷방의 값을 앞방에 넣고
					score[j] = temp;// 임시변수의 값을 앞방에 넣는다.
				}	
			}
//			System.out.print(score[i] + " ");
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "점 ");
		}
//////////////////////////////////////////////////////////////////////////////		
		
	}	
	public static void main(String[] args) {

		UseArray1 ua1 = new UseArray1();
		
			ua1.arrayUse1();
			System.out.println("-----------------------------");
			ua1.arrayUse2();
		
	}

}
