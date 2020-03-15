package basicsofJava;

public class While_For_Nested {

	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.println("This is for outer loop" + i);
			for (int j = 1; j<=5;j++) {
				System.out.println(" i = " + i + " : j = " + j);
				
				
			}
			i++;
		}

	}

}
