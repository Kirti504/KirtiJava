package basicsofJava;

public class Static_NonStatic {
	
	int i =10;                       //Global variables or class variables can be both static or non static
	char c = 'l';                   // local variables are neither static nor non static they are only local variables  
	public static char a ;          // object is nothing but has non static entities including non static methods and non static global variables of a class
	public static String strname = "kirti"; // static can be called only in static and non static can call both static and non static both
	static boolean b = true;
	
	
	public static void main(String[] args) {
		
		Static_NonStatic objref = new Static_NonStatic();
		objref.kirti();
		objref.sarthak();
		objref.selenium(); // it is very bad practice to call a static entity by objref
		
		System.out.println("this is the main method");
		selenium();
		java();
		Static_NonStatic.selenium();
		Static_NonStatic.java();
	     char a;           // or Static_NonStatic.a = 'h'; 
		String strname = "aarav";
		
		
		
		
		

	}
	
	public static void selenium() {
		
		
		
		int j = 10;
		char s = 'u';
		String employee = "thoughtworks";
		System.out.println(employee);
		
	}
    
	public static void java() {
		
		String employee = "oracle";
		System.out.println(employee);
		
	}
	
	public void sarthak() {
		String employee = "cisco";
		System.out.println(employee);
		kirti();
		java();
		selenium();
		
		
	}
	
	public void kirti() {
		String employee = "sapient";
		System.out.println(employee);
		
	}
}
