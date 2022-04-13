package co.edu.dimension;

import java.util.Scanner;

public class BookExample {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			if(selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				if(scores == null) {
					System.out.println("학생 수를 지정하여주세요.");
				}else {
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores["+ i +"] > ");	
						scores[i] = Integer.parseInt(scn.nextLine());
					}
				}
			}else if(selectNo == 3) {
				if(scores == null) {
					System.out.println("학생 수를 지정하여주세요.");
				}else {
					for(int i = 0; i < scores.length; i++) {
						System.out.println("scores["+ i +"] > " + scores[i]);	
					}
				}
			}else if(selectNo == 4) {
				if(scores == null) {
					System.out.println("학생 수를 지정하여주세요.");
				}else {
					int sum = 0;
					int maxVal = 0;
					for(int i = 0; i < scores.length; i++) {
						if(scores[i] > maxVal) {
							maxVal = scores[i];
						}
						sum += scores[i];
					}
					
					System.out.println("최고 점수 > " + maxVal);
					System.out.println("평균 점수 > " + (double)sum/studentNum);
				}
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("시스템 종료.");
	}
}
