package com.volkosky.spring3.annotations;

public class SpellChecker {
	public SpellChecker() {
		System.out.println("Inside SpellChecker constructor.");
	}

	public void checkSpelling() {
		System.out.println("Inside checkSpelling.");
	}
	
	public void init(){
		System.out.println("SpellChecker - init.");
	}
	
	public void cleanup(){
		System.out.println("SpellChecker - cleanup.");
	}
}
