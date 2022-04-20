package co.edu.multiLine;

import java.util.Scanner;

public class MultiLineExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "";
		while(true) {
			String temp = scn.nextLine();
			str += temp + "\n";
			if(temp.equals("")) {
				break;
			}
		}
		System.out.println(str);
	}
}
