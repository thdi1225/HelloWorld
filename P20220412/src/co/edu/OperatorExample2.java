package co.edu;

public class OperatorExample2 {
	public static void main(String[] args) {
		//비교연산자, 논리연산자
		int num1 = 10;
		int num2 = 20;
		
		if(num1 == num2) {
			System.out.println("두 수는 같습니다.");
		}
		
		if(num1 != num2) {
			System.out.println("두 수는 다릅니다.");
		}

		if(num1 >= num2) {
			System.out.println("num1이 크거나 같습니다.");
		}
		
		if(num1 <= num2) {
			System.out.println("num2이 크거나 같습니다.");
		}
		
		if((num1 % 2 == 0) && (num2 % 2 == 0)) {
			System.out.println("두 수는 짝수.");	
		}else {
			System.out.println("두 수가 짝수는 아닙니다.");
		}
		
		if((num1 % 2 == 0) || (num2 % 2 == 0)) {
			System.out.println("두 수 중 하나는 짝수.");	
		}else {
			System.out.println("두 수는 홀수.");
		}
		
		System.out.println("end of prog");
	}
}
