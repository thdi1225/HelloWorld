package co.edu.api;

import java.time.LocalDate;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ex) 000000-0000000");
		String str = scn.nextLine();
		
		if(date(str)) {
			String result = checkInfo(str);
			System.out.println(result);
		}
		
	}
	
	public static String checkInfo(String userInfo) {
		userInfo = userInfo.trim();
		if(userInfo.length() == 14) {
			if(userInfo.substring(0,6).indexOf("-") != -1 || userInfo.substring(7,14).indexOf("-") != -1 ) {
				return "잘못된 주민번호입니다.";
			}else if(userInfo.substring(6,7).equals("-")) {
				String year = userInfo.substring(0, 2);
				String month = userInfo.substring(2, 4);
				String day = userInfo.substring(4, 6);
				String gender = null;
				if(userInfo.substring(7, 8).equals("1") || userInfo.substring(7, 8).equals("3") ) {
					gender = "남자입니다.";
				}else if(userInfo.substring(7, 8).equals("2") || userInfo.substring(7, 8).equals("4") ) {
					gender = "여자입니다.";
				}else {
					return "잘못된 주민번호입니다.";
				}
				
				String result = year + "년 " + month + "월 " + day + "일, " + gender;
				
				return result;
			}else {
				return "형식에 맞게 입력하세요.";
			}
		}else {
			return "형식에 맞게 입력하세요.";
		}
	}
	
	public static boolean date(String userInfo) {
		String year = userInfo.substring(0, 2);
		String month = userInfo.substring(2, 4);
		String day = userInfo.substring(4, 6);
		
		try {
			LocalDate ldate = LocalDate.of(Integer.parseInt(20+year), Integer.parseInt(month), Integer.parseInt(day));
			if(LocalDate.now().isBefore(ldate)) {
				return true;
			}else {
				System.out.println("잘못된 주민번호입니다.");
				return false;
			}
		}catch(Exception e) {
			System.out.println("잘못된 주민번호입니다.");
			return false;
		}
	}
}
