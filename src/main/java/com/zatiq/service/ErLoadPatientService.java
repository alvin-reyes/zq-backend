/*
 * 
 */
package com.zatiq.service;
import static spark.Spark.*;
import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
/**
 * The Class ErLoadPatientService.
 */
@Service
public class ErLoadPatientService {
	
	/**
	 * Instantiates a new er load patient service.
	 */
	public ErLoadPatientService() {
		
		get("/patientservice/", (res,req) -> {
			return null;
		});
	}
	

}
