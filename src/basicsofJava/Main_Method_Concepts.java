package basicsofJava;

public class Main_Method_Concepts {

	public static void main(String[] args) {
		                                               //public is an access modifier (private , protected, default)
		                                              //static is a keyword
	System.out.println("this is the main method");	  //void is a return type
		                                              //Main method has return type void because you cannot create the object of main method
		                                              //String is also a class
		                                              //[] - is an Array representation
		                                              //args - arguments
		                                //whoever designed java - he said that execution/control will happen in main method only
		                     // we can write static public or public static - it will work
                              //the position of [] can be placed anywhere post the String class
	                         //args which is the argument can be represented with anything. e.g., kirti
	                          //String[] can be represented as String...
	}
	
	public static void test() {
		System.out.println("this is test method");
	}

}
