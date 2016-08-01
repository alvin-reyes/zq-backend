/*
 * 
 */
package com.zatiq.service;

import static spark.Spark.get;
import static spark.Spark.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zatiq.dao.BusinessDaoImpl;
@Service
public class AddUpdateBusinessService {
	
	@Autowired
	private BusinessDaoImpl businessDao;
	
	public AddUpdateBusinessService() {
		
		post("/business/add/bulk/" , (req,res)-> {
			//	We need to create service that accepts bulk inserts.
			//	We need to check each if it's already on the database, if it is, then don't insert.
			//	If it's not then insert
			
			return "bulk";
		});
		
		post("/business/add/", (req, res) -> {
			
			//	Save the business if isn't in there.
			String businessMetadata = req.queryParams("business");
			
			//	Save the review
			String userId = req.queryParams("user_id");
			String review = req.queryParams("rating");
			
			res.header("Access-Control-Allow-Headers","Content-Type");
			res.header("Access-Control-Allow-Methods","POST");
			res.header("Access-Control-Allow-Origin","http://localhost:8100");
			
			return "hello";
		});
		
		get("/business/update/", (req, res) -> {
			return "hello world1";
		});
	}
}
