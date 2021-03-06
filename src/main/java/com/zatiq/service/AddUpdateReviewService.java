/*
 * 
 */
package com.zatiq.service;

import static spark.Spark.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zatiq.dao.RatingsDaoImpl;
import com.zatiq.dao.ReviewDaoImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class AddUpdateReviewService.
 */
@Service
public class AddUpdateReviewService implements ZqService {
	
	/** The review dao. */
	@Autowired
	private ReviewDaoImpl reviewDao;
	
	/**
	 * Instantiates a new adds the update review service.
	 */
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
