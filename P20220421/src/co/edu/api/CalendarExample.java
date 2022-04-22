package co.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		int year = 2020;
		int month = 5;
		
		Calendar today = Calendar.getInstance();
		today.set(year, month-1, 1);
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH));
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println(today.getActualMaximum(Calendar.DATE));
		
		Date toDate = new Date();
		
		System.out.println(toDate.toString());
		toDate = new Date("2021/05/05");
		System.out.println(toDate.toString());
		
		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate);
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt = LocalDateTime.of(20, 10, 10, 10, 10, 10, 10);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM-dd");
		System.out.println(ldt.format(dtf));
		
		SimpleDateFormat sDate = new SimpleDateFormat("yy년 MM달 dd일 HH시 mm분 ss초");
		System.out.println(sDate.format(toDate));
	}
}
