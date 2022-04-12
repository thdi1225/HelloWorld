package co.edu.loop;

public class ForExample2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i == 31) {
				System.out.println("종료하겠습니다.");
				break;
			}
			if(i % 2 == 0) {
				System.out.println("현재 i의 값은 => " + i);
				continue;
			}
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
