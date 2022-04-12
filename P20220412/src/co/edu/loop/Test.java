package co.edu.loop;

public class Test {
	public static void main(String[] args) {
		String star = "*";
		String spacebar = " ";
		for(int i = 0; i <= 10; i+=2) {
			for(int j = 10; j >= i; j-=2) {
				System.out.print(spacebar);
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(star);
			}
			
			System.out.println();
		}
	}
}
