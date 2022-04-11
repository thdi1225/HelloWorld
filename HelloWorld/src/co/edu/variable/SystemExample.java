package co.edu.variable;

import java.util.Scanner;

public class SystemExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		System.out.println("세개의 단어를 입력. 예) 안녕 방가 잘가");
//		while(scn.hasNext()) {
//			String str = scn.next();
//			System.out.println(str);
//			if(str.equals("exit")) {
//				break;
//			}
//		}
		
		try {
			while(true) {
				int readByte = System.in.read();
				System.out.println(readByte);
				if(readByte == 97){
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
