package com.zatiq.service;

import static spark.Spark.*;
import org.springframework.stereotype.Service;

@Service
public class AddUpdateRatingsService {
	public AddUpdateRatingsService() {
		post("/rating/add/", (req, res) -> {
			String userId = req.queryParams("user_id");
			String review = req.queryParams("review");
			return "hello!!";
		});
		get("/rating/update/", (req, res) -> {
			return "hello world1";
		});
	}
}
