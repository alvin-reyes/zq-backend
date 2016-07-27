package com.zatiq.service;

import static spark.Spark.*;
import org.springframework.stereotype.Service;

@Service
public class AddUpdateRatingsService {
	public AddUpdateRatingsService() {
		
		post("/rating/add/", (req, res) -> {
			
			//	Save the business if isn't in there.
			String businessMetadata = req.queryParams("business");
			
			//	Save the review
			String userId = req.queryParams("user_id");
			String review = req.queryParams("rating");
			
			//
			
			return "hello!!";
		});
		get("/rating/update/", (req, res) -> {
			//	update the review
			return "hello world1";
		});
	}
}
