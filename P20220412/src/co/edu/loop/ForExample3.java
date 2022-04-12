package co.edu.loop;

public class ForExample3 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
			if(sum > 1000) {
				System.out.println("1000보다 큰 최소합계 : " + sum);
				System.out.println("순번 : " + i);
				break;
			}
		}

		System.out.println("--------------------------------------------");

		sum = 1;
		
		for(int j = 1; j <= 10; j++) {
			sum = sum * j;
		}
		System.out.println(sum);

		System.out.println("--------------------------------------------");
		
		for(int i = 1; i <= 100; i++) {
			if(100 % i == 0) {
				System.out.println("100의 약수 : " + i);
			}
		}
	}
}
