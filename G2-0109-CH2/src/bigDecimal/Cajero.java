package bigDecimal;

import java.math.BigDecimal;

public class Cajero {
	
	double operacion(double importe1, double importe2){
		return importe2 - importe1;
	}
	
	float operacion(float importe1, float importe2){
		return importe2 - importe1;
	}
	
	BigDecimal operacionBig(BigDecimal importe1, BigDecimal importe2){
		return importe2.subtract(importe1);
	}

}
