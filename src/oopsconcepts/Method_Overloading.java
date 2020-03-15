package oopsconcepts;

public class Method_Overloading {

	public static void main(String[] args) {
		
		System.out.println("Main");
		Method_Overloading objref = new Method_Overloading();
		objref.test();
		objref.test(10);
		main(20);

	}
	
	public void test() {
		System.out.println("Test method");
	}
    
	public void test(int i) {
		System.out.println("The value of i is" + i);
	}
	
	public static void main(int i) {
		
		System.out.println(i);
		
	}
}
