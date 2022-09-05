class Principal2 extends Principal1{
	public static void main(String[] args) {
		final int x = 8;
		final StringBuilder sb = 
				new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb);
	}
//	@Override
//	int getCookies() {
//		return 0;
//	}
}


public class Principal1 {

	final int getCookies() {
		return 4;
	}

	void feedAnimals(final int param) {

		final int bananas = 1;
		final int apples = 2;
		int numberOfAnimals = 3;
		final int cookies = getCookies();
		switch (numberOfAnimals) {

		case bananas:

		case apples: // DOES NOT COMPILES

		//case getCookies(): // DOES NOT COMPILE

		//case cookies: // DOES NOT COMPILE
			
		//case param:

		case 3 * 5:
		}

	}

}
