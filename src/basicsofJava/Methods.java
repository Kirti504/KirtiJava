package basicsofJava;

public class Methods {

	
	public static void main(String[] args) {
		Methods objref = new Methods();
		int a = objref.java();
		System.out.println(a);
	String str4 = objref.selenium();
	System.out.println(str4);
		

	}

	public int java() {
	
		int i = 10;
		int j = 20;
		int k = i+j;
		return k;
		
		
	}
	
	public String selenium() {
		
		String str1 = "Kirti";
		String str2 = "Sele";
		String str3 = str1 + str2;
		return str3;
		
		
		
		
	}
	
	public void training() {
		
	}
	
	public void testing() {
		
	}
}

