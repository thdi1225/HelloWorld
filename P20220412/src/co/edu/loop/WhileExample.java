package co.edu.loop;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while (i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		while(isTrue) {
			System.out.println("숫자를 입력하세요. 종료하려면 -1을 입력하세요.");
			int temp = scn.nextInt();
			if(temp == -1) {
				isTrue = false;
				continue;
			}
			sum += temp;
		}
		System.out.println("입력값의 합은 " + sum);
	}
}
