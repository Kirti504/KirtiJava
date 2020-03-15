package basicsofJava;

public class Nested_Forloop {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {//outer for loop
			System.out.println("this is for outer loop"+ i);
			
			for (int j =1; j<= 10; j++) {//inner for loop
				System.out.println(" i = " + i + " : j = " + j);
				
				
			}
			
		}
	}

}
