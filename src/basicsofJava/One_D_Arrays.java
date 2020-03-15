package basicsofJava;

public class One_D_Arrays {

	public static void main(String[] args) {
		int i[] = new int[6];
		i[0] = 2;
		i[1] = 4;
		i[2] = 6;
		i[3] = 8;
		i[4] = 5;
		i[5] = 9;
		
		for (int j = 0; j < i.length; j++) {
			
			System.out.print(i[j] + " ");
		}
		
		System.out.println("");
		
		char a[] = new char[4];
		a[0] = 's';
		a[1] = 'w';
		a[2] = 'e';
		a[3] = 'r';
		
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
		
		System.out.println("");
		
		String s[] = new String[3];
		s[0] = "selenium";
		s[1] = "selenium1";
		s[2] = "selenium2";
		
		for(int m =0; m < s.length; m++) {
			
			System.out.print(s[m] + " ");
			
		}
		
		System.out.println("");	
				
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = true;
		
		for (int l = 0; l < b.length; l++) {
			System.out.print(b[l] + " ");
		}
		
			

	}

}
