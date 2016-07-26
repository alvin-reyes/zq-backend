package com.zatiq.main;

import static spark.Spark.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zatiq.config.AppConfig;

@Configuration
@ComponentScan({"com.areyes.erload"})
public class MainEntry {
	public static void main(String[] args) {
		port(8081);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
