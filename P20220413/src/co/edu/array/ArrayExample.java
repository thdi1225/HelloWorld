package co.edu.array;

public class ArrayExample {
	public static void main(String[] args) {
		//학생의 점수 30명.
		
		// 여러개의 같은 유형의 값을 저장.
		int[] intArray = new int[30]; // 정수 int를 30개 담을 공간 생성.
		
		intArray[0] = 30;
		intArray[4] = 40;
		intArray[29] = 55;
				
		double[] doubleArray = new double[10]; // 실수 double를 10개 담을 공간 생성.
		
		String[] strArray = new String[5];
		
		int[] otherArray = {10, 20, 30, 40}; // 초기값 지정
		int[] theOtherArray = {10, 20, 30, 40}; // 초기값 지정
		
		System.out.println(otherArray[0]);
		
		if(otherArray[0] == theOtherArray[0]) {
			System.out.println("same");
		}else {
			System.out.println("diff");
		}
	}
}
