package co.edu;

import java.util.Scanner;

public class CalTimeEx {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("초를 입력하세요.");
		int time = scn.nextInt();
		// 시, 분, 초
		// 5000%(60*60)
		
		int hours, minutes, secs;
		hours = time / (60*60);
		time = time % (60*60);
		minutes = time / (60);
		secs = time % (60);
		
		System.out.printf("%d시 %d분 %d초", hours, minutes, secs);
	}
}
