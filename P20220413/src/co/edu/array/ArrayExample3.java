package co.edu.array;

public class ArrayExample3 {
	public static void main(String[] args) {
		int[] intArray = {78, 83, 88, 92, 63, 44, 55};
		int sum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		double avg = (double)sum / intArray.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
		System.out.println("\n-------------------------------------------------------------\n");
		
		sum = 0;
		int cnt = 0;
		for(int i = 0; i < intArray.length; i++) {
			if(i % 2 == 0) {
				sum += intArray[i];
				cnt++;
			}
		}
		avg = (double)sum / cnt;
		
		System.out.println(sum);
		System.out.println(avg);

		System.out.println("\n-------------------------------------------------------------\n");
		
		sum = 0;
		cnt = 0;
		for(int i = 0; i < intArray.length; i++) {
			if(i % 2 == 1) {
				sum += intArray[i];
				cnt++;
			}
		}
		avg = (double)sum / cnt;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}
