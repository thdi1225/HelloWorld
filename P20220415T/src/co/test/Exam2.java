package co.test;

// 조건문과 반복문.
// 
// Math.random()을 사용해서 1  ~ 10사이의 임의의 수를 추출.(10번 반복작업 수행) 
// 2의 배수와 3의 배수의 합계를 각각 구하도록 하세요.
// 6의 경우에는 2와 3의 배수이므로 2의 배수와 3의 배수의 합계에 각각 더해지도록 하세요.
// 2의 배수의 합 : 26, 3의 배수의 합 : 27
public class Exam2 {
	public static void main(String[] args) {
		
		int second = 0;
		int third = 0;

		for(int i = 0; i < 10; i++) {
			int randomVal = (int) ((Math.random() * 10) + 1);
			
			if(randomVal % 2 == 0 && randomVal % 3 == 0) {
				second += randomVal;
				third += randomVal;
			}else if(randomVal % 2 == 0) {
				second += randomVal;
			}else if(randomVal % 3 == 0) { 
				third += randomVal;
			}
		}
		
		System.out.println("2의 배수의 합 : " + second + ", 3의 배수의 합 : " + third);
	}
}
