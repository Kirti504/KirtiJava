package basicsofJava;

public class Basic_forloop {

	public static void main(String[] args) {
		
		/*for(int i=10; i >=1; i--) {
			System.out.print(i + " ");
		}*/
		int sum =0;
		for (int i =1; i<=100; i++) {
			
			sum = sum + i;
			
		}
System.out.println("the sum of first 100 natural numbers is" + sum);
	}

}
