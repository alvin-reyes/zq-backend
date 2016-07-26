package com.zatiq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zatiq.service.AddUpdateRatingsService;
import com.zatiq.service.AddUpdateReviewService;
import com.zatiq.service.ErLoadPatientService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public AddUpdateRatingsService getAddUpdateRatingsService() {
		return new AddUpdateRatingsService();
	}
	
	@Bean
	public AddUpdateReviewService getAddUpdateReviewService() {
		return new AddUpdateReviewService();
	}
	
	@Bean
	public ErLoadPatientService getErLoadPatientService() {
		return new ErLoadPatientService();
	}

}
