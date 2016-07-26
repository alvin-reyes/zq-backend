package com.zatiq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zatiq.service.ErLoadPatientService;
import com.zatiq.service.ErloadMemberService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public ErloadMemberService getErLoadMemberService() {
		return new ErloadMemberService();
	}
	
	@Bean
	public ErLoadPatientService getErLoadPatientService() {
		return new ErLoadPatientService();
	}

}
