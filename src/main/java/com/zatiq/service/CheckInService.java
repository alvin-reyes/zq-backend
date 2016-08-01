/*
 * 
 */
package com.zatiq.service;

import static spark.Spark.get;
import static spark.Spark.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zatiq.dao.CheckinDaoImpl;
import com.zatiq.dao.RatingsDaoImpl;

@Service
public class CheckInService {
	
	@Autowired
	private CheckinDaoImpl checkinDao;
	
	public CheckInService() {
		
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