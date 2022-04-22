package co.edu.api;

public class SystemExample {
	public static void main(String[] args) {
		System.out.println("start");
//		System.exit(0);
		System.out.println("end");
		long start = System.currentTimeMillis();
		long sum = 0;
		for(int i = 0; i < 1000000; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println(end-start);
	}
}
