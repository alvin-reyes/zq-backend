/*
 * 
 */
package com.zatiq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zatiq.service.AddUpdateBusinessService;
import com.zatiq.service.AddUpdateRatingsService;
import com.zatiq.service.AddUpdateReviewService;
import com.zatiq.service.ErLoadPatientService;

// TODO: Auto-generated Javadoc
/**
 * The Class ServiceConfig.
 */
@Configuration
public class ServiceConfig {
	
	/**
	 * Gets the adds the update ratings service.
	 *
	 * @return the adds the update ratings service
	 */
	@Bean
	public AddUpdateRatingsService getAddUpdateRatingsService() {
		return new AddUpdateRatingsService();
	}
	
	/**
	 * Gets the adds the update review service.
	 *
	 * @return the adds the update review service
	 */
	@Bean
	public AddUpdateReviewService getAddUpdateReviewService() {
		return new AddUpdateReviewService();
	}
	
	/**
	 * Gets the adds the update buisness service.
	 *
	 * @return the adds the update buisness service
	 */
	@Bean
	public AddUpdateBusinessService getAddUpdateBuisnessService() {
		return new AddUpdateBusinessService();
	}

}
