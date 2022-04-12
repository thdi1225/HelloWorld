package co.edu.loop;

public class NestedExample {
	public static void main(String[] args) {
		
		for(int j = 2; j <= 9; j++) {
			int dan = j;
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * "+ i + " = " + dan*i);
			}
		}
		
		System.out.println("--------------------------------------------------------------");
		
		String star = "*";
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------");

		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------");
		
		String spacebar = " ";
		for(int i = 1; i <= 10; i+=2) {
			for(int j = 10; j >= i; j-=2) {
				System.out.print(spacebar);
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------");
		
		for(int i = 1; i <= 10; i+=2) {
			for(int j = 1; j <= i; j+=2) {
				System.out.print(spacebar);
			}
			for(int j = 10; j > i; j--) {
				System.out.print(star);
			}
			
			System.out.println();
		}
	}
}
