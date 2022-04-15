package co.test;

// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.

public class Exam3 {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		int[] newArray = new int[10];
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < intArray.length; i++) {
			int randomVal = (int) ((Math.random()*10)+1);
			intArray[i] = randomVal;
			sum += randomVal;
		}

		avg = sum/10.0;
		
		int j = 0;
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] > avg) {
				newArray[j] = intArray[i];
				j++;
			}
		}
	}
}