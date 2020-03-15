package basicsofJava;

public class TwoD_Arrays {

	public static void main(String[] args) {
		
	/*	String s1[][] = new String[2][3];
		s1[0][0] = "kirti";
		s1[0][1] = "Kirti1";
		s1[0][2] = "Kirti2";
		s1[1][0] = "kirti";
		s1[1][1] = "Kirti1";
		s1[1][2] = "Kirti2";
		
		System.out.println("the rows in this array are :" + s1.length);
		System.out.println("the columns in this array are:" + s1[0].length);
		
		for (int i = 0; i < s1.length; i ++) {
			
			for (int j = 0; j < s1[0].length; j++) {
				
				System.out.print(s1[i][j] + "***");
			}
			
			System.out.println("");
		}*/
		
		/*int i[][] = new int[3][3];
		i[0][0] = 1;
		i[0][1] = 3;
		i[0][2] = 3;
		i[1][0] = 6;
		i[1][1] = 9;
		i[1][2] = 3;
		i[2][0] = 6;
		i[2][1] = 9;
		i[2][2] = 3;
		
		for (int k = 0; k < i.length; k++) {
			
			for (int l = 0; l < i[0].length; l++) {
				
				System.out.print(i[k][l] + "**");
			}
			System.out.println("");
		}*/
		
		char c[][] = new char[2][3];
		c[0][0] = 'w';
		c[0][1] = 't';
		c[0][2] = 'o';
		c[1][0] = 'y';
		c[1][1] = 'k';
		c[1][2] = 'p';
		
		for (int i = 0; i < c.length; i++) {
			for (int j =0; j < c[0].length; j++) {
				
				System.out.print(c[i][j] + "**");
			}
			
			System.out.println("");
		}
		

	}

}
