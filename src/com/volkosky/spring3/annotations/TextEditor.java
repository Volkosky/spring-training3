package com.volkosky.spring3.annotations;

public class TextEditor {
	private SpellChecker spellChecker;
	private AdditionalClass ac;

	public TextEditor(SpellChecker spellChecker, AdditionalClass ac) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
		this.ac = ac;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
		ac.printProperty();
	}
}
