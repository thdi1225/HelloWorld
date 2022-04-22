package co.edu.api;

public class WrapperExample {
	public static void main(String[] args) {
		int n1 = 100;
		Integer n2 = 200;
		n1 = n2;
		byte b1 = n2.byteValue();
		System.out.println(b1);
		Float f1 = 12.3f;
		
		Integer.parseInt("100");
		Double.parseDouble("123.456");
	}
}
