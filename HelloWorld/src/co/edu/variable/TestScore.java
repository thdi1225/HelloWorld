package co.edu.variable;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int mathScore ,engScore ,koreanScore;
		
		System.out.println("수학점수를 입력하세요.");
		mathScore = scn.nextInt();
		System.out.println("영어점수를 입력하세요.");
		engScore = scn.nextInt();
		System.out.println("국어점수를 입력하세요.");
		koreanScore = scn.nextInt();
		
		int sum = mathScore + engScore + koreanScore;
		double avg = sum/3.0;
		
		int maxValue = Integer.max(mathScore, engScore);
		maxValue = Integer.max(koreanScore, maxValue);
//		if(mathScore>engScore){
//			maxValue = mathScore;
//		}
//		
//		if(maxValue < koreanScore) {
//			maxValue = koreanScore;
//		}
		
		System.out.printf("합은 %3d이고 평균은 %.2f이고 최고점은 90점입니다.", sum, avg , maxValue);
	}
}
