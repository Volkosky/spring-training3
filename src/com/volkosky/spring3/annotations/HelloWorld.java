package com.volkosky.spring3.annotations;

public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}
