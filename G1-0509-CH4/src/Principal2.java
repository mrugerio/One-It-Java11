
class Pato extends Principal2 {
	
//	int getCookies() {
//		return 0;
//	}
	
}


public class Principal2 {

	final int getCookies() {
		return 5;
	}

	void feedAnimals(final int otraGalleta) {

		final int bananas = 1;
		final int apples = 2;
		int numberOfAnimals = 3;
		final int cookies =  getCookies();
		final int galletas = otraGalleta;
		
		switch (numberOfAnimals) {

		case bananas:

		case apples: // DOES NOT COMPILES

		//case getCookies(): // DOES NOT COMPILE

		//case cookies: // DOES NOT COMPILE

		case 3 * 5:
			
		//case otraGalleta:
		
		}
	}

}
