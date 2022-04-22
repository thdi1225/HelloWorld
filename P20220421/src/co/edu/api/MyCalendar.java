package co.edu.api;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		String y = "2022";
		String m = "04";
		
		showCal(y, m);
	}

	public static void showCal(String y, String m) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.parseInt(y), Integer.parseInt(m)-1, 1);

		System.out.println("       2022년 4월         ");
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		System.out.println("===========================");

		for(int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.printf("%4s", " ");
		}
		
		for(int i = 1; i <= calendar.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d", i);
			if(i + calendar.get(Calendar.DAY_OF_WEEK) % 7 == 0) {
				System.out.println("0000");
			}
		}
	}
}
