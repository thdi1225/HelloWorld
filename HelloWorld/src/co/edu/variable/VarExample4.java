package co.edu.variable;

public class VarExample4 {
	public static void main(String[] args) {
		int val = 10; // 4 * 1byte => 1byte = 8 * bit 값이 on/off
		System.out.println(Integer.MAX_VALUE);
		
		long val2 = 2147483648L;
		long val3 = 10; // 10 -> long 변환(promotion:자동형변환).
		int val4 = (int) 2147483648L; // long -> int(casting:강제형변환).
		int result = (int) (10000000000000L) / 5;
		
		long val5 = 10000000000L;
		long val6 = 10L;
		
		result = (int) (val5 - val6);
		System.out.println(result);
		
		char charLit = 97; // 0~ 65535까지의 정수값에 문자열 값을 매핑
		System.out.println(charLit);
		charLit = 44032;
		
		for(int i=0; i < 99; i++) {
			System.out.println(charLit);
			charLit = (char) (charLit + i);
		}
		System.out.println(charLit);
	}
}
