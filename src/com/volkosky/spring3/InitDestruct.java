package com.volkosky.spring3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitDestruct implements InitializingBean, DisposableBean, BeanPostProcessor {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Do some initialization stuff (via Interface)");
	}

	public void init() {
		System.out.println("Do some initialization stuff (via XML)");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Do some destroying stuff (via Interface)");
	}

	public void destruct() {
		System.out.println("Do some destroying stuff (via XML)");
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("BeforeInitialization : " + beanName);
		return bean; // you can return any other object as well
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("AfterInitialization : " + beanName);
		return bean; // you can return any other object as well
	}
}
