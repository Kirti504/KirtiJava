package basicsofJava;

public class Methods_Java {

	public static void main(String[] args) {
	System.out.println("This is the main method");	
     test();
     test();
     test();
     Methods_Java.test();
     sample(1,2, 3);
     sample(5, 6);
     Methods_Java.sample(6, 10);
     Methods_Java.sample(1,2,3);
	}
	
	public static void test() {
 System.out.println("this is the test method");
}
	
	public static void sample(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	public static void sample(int c, int d, int e) {
		int sum = c + d + e;
		System.out.println(sum);	
	}
	
	
}
