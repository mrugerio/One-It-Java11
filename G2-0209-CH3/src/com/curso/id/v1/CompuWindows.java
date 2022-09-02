package com.curso.id.v1;

public class CompuWindows implements Compu {

	String version;

	public CompuWindows(String version) {
		this.version = version;
	}
	
	public void encenderCompu() {
		System.out.println("Encender Windows: "+version);
	}
	
	
}
