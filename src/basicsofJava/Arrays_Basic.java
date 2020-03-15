package basicsofJava;

public class Arrays_Basic {

	public static void main(String[] args) {
		int i[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + " ");
		}
		
		System.out.println("");
			
		     //System.out.println(i[9]);
			//System.out.println(i.length);
       char a[] = {'e','&','o','*','e'};
       
       for (int k = 0; k < a.length; k++) {
    	   System.out.print(a[k] + " ");
       }
       
       System.out.println("");
       
       String s[] = {"kirti", "kirti1","kirti2","kirti3"};
       
       for (int l = 0; l < s.length; l++) {
    	   
    	   System.out.print(s[l] + " ");
    	   
       }
       
       System.out.println("");
       
       boolean b[] = { true, false, false, true};
       
       for ( int m = 0; m <=  b.length - 1; m++) {
    	   
    	   System.out.print(b[m] + " ");
    	   
       }
	}

}
