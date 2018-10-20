package com.volkosky.spring3.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AdditionalConfig.class)
public class TextEditorConfig {
   @Bean 
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() , new AdditionalClass("texteditor property"));
   }

   @Bean(initMethod = "init", destroyMethod = "cleanup" ) 
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}
