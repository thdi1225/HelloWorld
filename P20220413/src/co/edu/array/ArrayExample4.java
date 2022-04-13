package co.edu.array;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			intArray[i] = (int) ((Math.random() * 30) + 1);
			if(intArray[i] > 15) {
				sum += intArray[i];
				cnt++;
			}
		}
		avg = (double)sum / cnt;
		
		System.out.println(avg);
	}
}