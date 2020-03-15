package basicsofJava;

public class Increment_Decerment_Operator_Concept {

	public static void main(String[] args) {
		
		/*int i = 10; //here latest value of i = 10
		int j = i++; //post increment situation, j latest value is 10, here latest value of i = 11;
		int k = ++i; //k will be 12, i will also be 12
		
		System.out.println(i); //i = 12
		System.out.println(j); //j = 10
		System.out.println(k); //k = 11 */
		
		int a = 11; //a = 11
		int b = a--;// b = 11, a =10
		int c  = a++ - --b;// a = 10, b = 10, c =0, a= 11, b = 10
		int d = --c + a++ - b++ + c--; // d = -1 + 11-10+ -1, d = -1, a = 12, b = 11, c = -2
		int e = (d++ * --c) + --c + a++ ;// e = (-1*-3) + -4 + 12 , e =11, d = 0, c = -4, a = 13
		int f = c++ - --c + ++c + c--;// f= -4 - -4 + -3 + -3 = -6 , c = = -4
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
				

	}

}
