package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		
		while (isTrue) {
			int value = scn.nextInt();
			sum+=value;
			if(sum >= 200) {
				isTrue = false;
				continue;
			}
		}
		System.out.println("결과 : "+ sum);		
	}
}
