package com.zatiq.service;

import static spark.Spark.*;
import org.springframework.stereotype.Service;

@Service
public class AddUpdateReviewService {
	public AddUpdateReviewService() {
		post("/review/add/", (req, res) -> {
			
			//	Save the business if isn't in there.
			String businessMetadata = req.queryParams("business");
			
			//	Save the review
			String userId = req.queryParams("user_id");
			String review = req.queryParams("rating");
			
			
			return null;
		});
		
		post("/review/add/", (req, res) -> {
			String userId = req.queryParams("user_id");
			String review = req.queryParams("review");
			return null;
		});
		
		get("/review/update", (req, res) -> {
			return "hello world1";
		});
	}
}
