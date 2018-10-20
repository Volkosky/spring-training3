package com.volkosky.spring3;

public class HelloWorld {
	private String message;
	private String message2;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void setMessage2(String message) {
		this.message2 = message;
	}

	public void getMessage2() {
		System.out.println("World Message2 : " + message2);
	}
}