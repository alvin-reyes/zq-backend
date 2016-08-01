/*
 * 
 */
package com.zatiq.service;

import static spark.Spark.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zatiq.dao.RatingsDaoImpl;
import com.zatiq.exceptions.DaoException;
import com.zatiq.obj.Business;
import com.zatiq.obj.Rating;

@Service
public class AddUpdateRatingsService implements ZqService {
	
	@Autowired
	private RatingsDaoImpl ratingDao;
	
	public AddUpdateRatingsService() {
		

		post("/rating/add/", (req, res) -> {
			
			try {
				Business business = new Business();
				business.setId(Integer.valueOf(req.queryParams("bid")));
				Rating rating  = new Rating();
				rating.setBusiness(business);
				rating.setRating(Double.valueOf(req.queryParams("rating")));
				
				ratingDao.insertOrUpdateRating(rating);
				res.status(200);
			}catch(DaoException daoEx){
				daoEx.printStackTrace();
				res.status(500);
				return DEFAULT_ERROR_RESPONSE;
			}
			
			return DEFAULT_SUCCESSFUL_RESPONSE;
		});
		post("/rating/update/", (req, res) -> {
			//	update the review
			return "hello world1";
		});
	}
}
