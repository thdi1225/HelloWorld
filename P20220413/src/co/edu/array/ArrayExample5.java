package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("점수를 입력하세요.");
			scores[i] = scn.nextInt();
		}
		
		int maxScore = 0;
		int minScore = 100;
		
		for(int i = 0; i < scores.length; i++) {
			if(maxScore < scores[i]) {
				maxScore = scores[i];
			}
			if(minScore > scores[i]) {
				minScore = scores[i];
			}
		}
		System.out.printf("최고점은 %d점, 최저점은 %d점", maxScore, minScore);
	}
}