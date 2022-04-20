package co.edu.project;

interface Runnable{
	public void run();
}

class RunClass implements Runnable {
	@Override
	public void run() {
		System.out.println("움직입니다.");
	}	
}

public class RunnableExample{
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("자꾸 움직입니다.");
			}
		};
		runnable.run();
		runnable = () -> System.out.println("자꾸자꾸 움직입니다.");
			
		runnable.run();
	}
}
