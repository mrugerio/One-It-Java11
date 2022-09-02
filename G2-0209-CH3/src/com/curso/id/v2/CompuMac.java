package com.curso.id.v2;

public class CompuMac implements Compu {

	String version;

	public CompuMac(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderCompu() {
		System.out.println("Encender Mac: "+version);
	}
	
	
}
