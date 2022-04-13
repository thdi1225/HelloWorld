package co.edu.dimension;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		
		System.out.println("첫번째 값 입력.");
		num1 = scn.nextInt();
		System.out.println("두번째 값 입력.");
		num2 = scn.nextInt();
		System.out.println("세번째 값 입력.");
		num3 = scn.nextInt();
		System.out.println("네번째 값 입력.");
		num4 = scn.nextInt();
		
		if(num1 > num2) {
			if(num2 > num3) {
				System.out.println(num3 + num2 + num1);
			}else {
				if(num1 > num3) {
					System.out.println(num2 + num3 + num1);
				}else {
					System.out.println(num2 + num1 + num3);
				}
			}
		} else {
			if(num1 > num3) {
				System.out.println(num2 + num3 + num1);
			}else {
				if(num2 > num3) {
					System.out.println(num3 + num2 + num1);
				}else {
					System.out.println(num3 + num1 + num2);
				}
			}
		}
		
		int[] intArray = {num1, num2, num3, num4};
		for(int j = 0; j < intArray.length - 1; j++) {
			for(int i = 0; i < intArray.length - 1; i++) {
				if(intArray[i] > intArray[i+1]) {
					int temp = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = temp;
				}
			}
		}
		System.out.println(intArray[0] + ", " + intArray[1] + ", " + intArray[2] + ", " + intArray[3]);
		
		for(int j = 0; j < intArray.length - 1; j++) {
			for(int i = 0; i < intArray.length - 1; i++) {
				if(intArray[i] < intArray[i+1]) {
					int temp = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = temp;
				}
			}
		}
		System.out.println(intArray[0] + ", " + intArray[1] + ", " + intArray[2] + ", " + intArray[3]);
	}
}
