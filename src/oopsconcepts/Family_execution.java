package oopsconcepts;

public class Family_execution {

	
	public static void main(String[] args) {
		
		Child objref = new Child();
		objref.ps4();
		objref.masters();
		objref.luxurycar();
		objref.fixedeposit();
		objref.farmhouse();
		objref.bunglow();
		objref.land();
		objref.vintagecar();
		
		
		Parent objref1 = new Parent();
		objref1.farmhouse();
		objref1.fixedeposit();
		objref1.luxurycar();
		
		Parent objref2 = new Child();
		objref2.farmhouse();
		objref2.fixedeposit();
		objref2.luxurycar();
		
		Child objref3 = (Child) new Parent();
		

	}

}
