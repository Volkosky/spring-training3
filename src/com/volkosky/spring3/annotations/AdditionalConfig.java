package com.volkosky.spring3.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AdditionalConfig {

	@Bean
	@Scope("prototype")
	public AdditionalClass additionalClass(){
		return new AdditionalClass("prpt");
	}
}
