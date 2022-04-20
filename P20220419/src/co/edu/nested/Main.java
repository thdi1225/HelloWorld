package co.edu.nested;

import co.edu.nested.Outer.Inner;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();
		
		Inner inner = outer.new Inner();
		inner.method2();
		
		Outer.Inner in = outer.new Inner();
		in.method2();
		in.method4();
		
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method5();
		Outer.Inner2.method6(); 
	}
}
