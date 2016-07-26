package com.zatiq.service;
import static spark.Spark.*;
import org.springframework.stereotype.Service;

@Service
public class ErLoadPatientService {
	
	public ErLoadPatientService() {
		
		get("/patientservice/", (res,req) -> {
			return null;
		});
	}
	

}
