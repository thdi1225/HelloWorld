package co.edu.variable;

public class HomeWork1 {
	public static void main(String[] args) {
		int orange = 127;
		int num1 = orange / 10;
		int num2 = orange;
		
		if(num1 == 0) {
			System.out.println("10개 상자 : " + 0);
		}else {
			System.out.println("10개 상자 : " + num1);
			num2 = orange % 10;
		}
		
		int num3 = num2 / 5;
		int num4 = num2 % 5;
		
		if(num3 == 0) {
			System.out.println("5개 상자 : " + 0);
		}else {
			if(num4 == 0) {
				System.out.println("5개 상자 : " + num3);
			}else {
				System.out.println("5개 상자 : " + (num3+1));
			}
			
		}
		
	}
}
