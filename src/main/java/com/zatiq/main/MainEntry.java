/*
 * 
 */
package com.zatiq.main;

import static spark.Spark.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zatiq.config.AppConfig;

// TODO: Auto-generated Javadoc
/**
 * The Class MainEntry.
 */
@Configuration
@ComponentScan({"com.zatiq"})
public class MainEntry {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		port(8081);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
