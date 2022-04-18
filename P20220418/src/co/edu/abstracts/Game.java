package co.edu.abstracts;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int[] problem = new int[5];
		int val = 0;
		int randomVal = 0;
		int num = 0;
		
		System.out.println("[*][*][*][*][*]");

		for(int i = 0; i < problem.length; i++) {
			
			randomVal = (int) (Math.random() * 5 + 1);
			
			for(int j = 0; j < i; j++) {
				if(problem[j] == randomVal) {
					isTrue = false;
					break;
				}else {
					isTrue = true;
				}
			}
			
			if(isTrue) {
				problem[i] = randomVal;
			}else {
				i--;
			}	
		}
		
		int[] nums = new int[5];		
		
		while(isTrue) {
			System.out.print("자릿수 > ");
			num = Integer.parseInt(scn.nextLine());
			
			System.out.print("숫자 > ");
			val = Integer.parseInt(scn.nextLine());
			
			for(int l = 0; l < problem.length; l++) {
				if(l == num-1) {
					if(problem[l] == val) {
						System.out.print("정답입니다.");
						isTrue = false;
						break;
					}else {
						nums[l] = num;
						System.out.print("[" + problem[l] + "]");
					}
				}else {
//					for(int b : nums) {
						System.out.print("[*]");	
//					}
						
					
				}
			}
			System.out.println("");
		}
		System.out.println("end of prog.");
	}
}
