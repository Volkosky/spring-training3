package com.volkosky.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.volkosky.spring3.annotations.AdditionalClass;
import com.volkosky.spring3.annotations.HelloWorld;
import com.volkosky.spring3.annotations.HelloWorldConfig;
import com.volkosky.spring3.annotations.TextEditorConfig;
import com.volkosky.spring3.annotations.TextEditor;

public class MainApp {
	public static void main(String[] args) {
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("Konfiguracja.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class,
				TextEditorConfig.class);

		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
		TextEditor te = context.getBean(TextEditor.class);
		te.spellCheck();
		// produceBean("helloWorld-singleton", context);
		// produceBean("helloWorld-prototype", context);
		// InitDestruct b1 = (InitDestruct) context.getBean("initDestruct");

		// exampleBeanInheritanceXML(context);
		// simpleInjection(context);

		// dependencyInjectionCollections(context);

		// context.registerShutdownHook();
	}

	/*
	 * private static void
	 * dependencyInjectionCollections(AbstractApplicationContext context) {
	 * JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
	 * 
	 * jc.getAddressList(); jc.getAddressSet(); jc.getAddressMap();
	 * jc.getAddressProp(); }
	 * 
	 * private static void simpleInjection(AbstractApplicationContext context) {
	 * TextEditor te = (TextEditor) context.getBean("textEditor");
	 * te.spellCheck(); }
	 * 
	 * private static void exampleBeanInheritanceXML(AbstractApplicationContext
	 * context) { HelloWorld objA = (HelloWorld)
	 * context.getBean("helloWorld-singleton"); objA.getMessage();
	 * objA.getMessage2();
	 * 
	 * HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
	 * objB.getMessage(); objB.getMessage2(); objB.getMessage3(); }
	 * 
	 * private static void produceBean(String id, ApplicationContext context) {
	 * System.out.println("Bean id: " + id); HelloWorld objA = (HelloWorld)
	 * context.getBean(id);
	 * 
	 * objA.setMessage("I'm object A"); objA.getMessage();
	 * 
	 * HelloWorld objB = (HelloWorld) context.getBean(id); objB.getMessage(); }
	 */
}
