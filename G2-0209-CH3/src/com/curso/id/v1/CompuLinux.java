package com.curso.id.v1;

public class CompuLinux implements Compu {

	String version;

	public CompuLinux(String version) {
		this.version = version;
	}
	
	@Override
	public void encenderCompu() {
		System.out.println("Encender Linux: "+version);
	}
	
	
}
