package co.edu.array;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1, num2;
		int sum = 0;
		
		for(int i = 1; i <=6; i++) {
			num1 = i;
			for(int j = 1; j <= 6; j++) {
				num2 = j;
				if(num1 + num2 == 6) {
					System.out.println(i + " : " + j);
					sum += 1;
				}
			}
		}
		System.out.println("합이 6이 되는 경우의 수 : " + sum);
	}
}