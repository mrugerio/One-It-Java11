package bigDecimal;

import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		
		Cajero c = new Cajero();
		double r = c.operacion(0.02, 0.03);
		System.out.println("Resultado double: "+r); //0.01

		float f = c.operacion(0.02f, 0.03f);
		System.out.println("Resultado float: "+f);
		
	
		System.out.println( 0.1f + 
				0.1f + 
				0.1f + 
				0.1f + 
				0.1f + 
				0.1f + 
				0.1f + 
				0.1f + 
				0.1f + 
				0.1f );
		
		BigDecimal b = c.operacionBig(
				new BigDecimal("0.02"), 
				new BigDecimal("0.03"));
		
		System.out.println("Resultado BigDecimal: "+b);
	


		
	}

}
