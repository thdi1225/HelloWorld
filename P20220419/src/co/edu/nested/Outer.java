package co.edu.nested;

public class Outer {

	private String f1;
	
	class Inner {
		String f2;
		
		void method2() {
			System.out.println("method2() call.");
		}

		void method4() {
			System.out.println("method4() call.");
		}
	}
	
	static class Inner2{
		String f4;
		static String f5;
		void method5() {
			System.out.println("method5() call.");
		}
		
		static void method6() {
			System.out.println("method6() call.");
		}
	}
	
	public void method1() {
		System.out.println("method() call.");
		
		class Local{
			String f3;
			
			void mothod3() {
				System.out.println("method3() call.");
			}
		}
		
		Local local = new Local();
		local.mothod3();
	}
}
