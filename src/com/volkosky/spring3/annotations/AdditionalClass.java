package com.volkosky.spring3.annotations;

public class AdditionalClass {
	
	private String property;

	public AdditionalClass(String property) {
		super();
		this.property = property;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
	public void printProperty(){
		System.out.println("Property: "+property);
	}

}
