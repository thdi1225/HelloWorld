package co.edu.loop;

import java.util.Scanner;

public class NestedExample {
	public static void main(String[] args) {
		
		for(int j = 2; j <= 9; j++) {
			int dan = j;
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * "+ i + " = " + dan*i);
			}
		}
		
		System.out.println("--------------------------------------------------------------");
		
		String star = "*";
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------");

		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------");
		
		String spacebar = " ";
		for(int i = 1; i <= 10; i+=2) {
			for(int j = 10; j >= i; j-=2) {
				System.out.print(spacebar);
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------");
		
		for(int i = 1; i <= 10; i+=2) {
			for(int j = 1; j <= i; j+=2) {
				System.out.print(spacebar);
			}
			for(int j = 10; j > i; j--) {
				System.out.print(star);
			}
			
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------");
		Scanner scn = new Scanner(System.in);
		int maxValue = scn.nextInt();
		
		for(int i = 1; i <= maxValue; i++) {
			if((maxValue/2)+1 == i) {
				for(int j = 1; j <= maxValue; j++) {
					System.out.print(star);
				}
			}else if((maxValue/2)+1 > i){
				for(int j = maxValue; j >= (i*2); j-=2) {
					System.out.print(" ");
				}
				for(int j = 1; j <= (i*2)-1; j++) {
					System.out.print(star);
				}
			}else if((maxValue/2)+1 < i){
				for(int j = maxValue; j <= (i*2)-2; j+=2) {
					System.out.print(" ");
				}
				for(int j = (maxValue*2); j >= i*2; j--) {
					System.out.print(star);
				}
			}
			
			System.out.println();
		}
	}
}
