package co.micol.prj.game;

import java.util.Scanner;

public class Mabangjin {

	private Scanner scn = new Scanner(System.in);

	public void run() {
		game();
	}

	private void game() {
		System.out.println("마방진 크기를 입력하세요. ");
		System.out.println("홀수만 입력하세요.");
		int size = scn.nextInt();
		
		int[][] arrayInt = new int[size][size];
		int num = 1;

		for(int i = 0, j = size/2; num <= size * size; num++) {
			arrayInt[i][j] = num;
			if(num%size == 0) {
				i++;
			}else {
				i--;
				j++;
				if(i<0) {
					i = size - 1;
				}
				if(j > size-1) {
					j = 0;
				}
			}
		}
		toPrint(arrayInt);
	}
	
	private void toPrint(int[][] arrayInt) {
		for(int[] num : arrayInt) {
			for(int n : num) {
				System.out.printf("%3d", n);
			}
			System.out.println();
		}
	}

}
