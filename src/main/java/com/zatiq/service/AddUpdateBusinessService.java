package com.zatiq.service;

import static spark.Spark.get;
import static spark.Spark.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zatiq.dao.BusinessDaoImpl;
import com.zatiq.dao.RatingsDaoImpl;
@Service
public class AddUpdateBusinessService {
	
	@Autowired
	private BusinessDaoImpl businessDao;
	
	public AddUpdateBusinessService() {
		
		post("/business/add/", (req, res) -> {
			
			//	Save the business if isn't in there.
			String businessMetadata = req.queryParams("business");
			
			//	Save the review
			String userId = req.queryParams("user_id");
			String review = req.queryParams("rating");
			
			
			return null;
		});
		
		get("/business/update", (req, res) -> {
			return "hello world1";
		});
	}
}
