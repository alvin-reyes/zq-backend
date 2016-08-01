package com.zatiq.service;

import static spark.Spark.get;
import static spark.Spark.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zatiq.dao.BusinessDaoImpl;
import com.zatiq.exceptions.DaoException;
import com.zatiq.obj.Business;

@Service
public class AddUpdateBusinessService implements ZqService {
	
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
			try {
				//	Create the object.
				Business businessToBeProcessed = new Business();
				businessToBeProcessed.setBusinessMetaData(req.queryParams("metadata"));
				businessToBeProcessed.setName(req.queryParams("bname"));
				businessToBeProcessed.setPhotoUrl(req.queryParams("bphoto"));
				businessToBeProcessed.setCoordLat(req.queryParams("blat"));
				businessToBeProcessed.setCoordLong(req.queryParams("blong"));	
				
				//	Save it!
				businessDao.insertOrUpdateBusiness(businessToBeProcessed);
				res.status(200);	//successful if no errors.
			}catch(DaoException daoEx) {
				daoEx.printStackTrace();
				res.status(500);	//set status to 500 to indicate error
			}
			
			res.header("Access-Control-Allow-Headers","Content-Type");
			res.header("Access-Control-Allow-Methods","POST");
			res.header("Access-Control-Allow-Origin","http://localhost:8100");
			
			return res.status();
		});
		
		post("/business/update/", (req, res) -> {
			try {
				//	Create the object.
				Business businessToBeProcessed = new Business();
				businessToBeProcessed.setBusinessMetaData(req.queryParams("metadata"));
				businessToBeProcessed.setName(req.queryParams("bname"));
				businessToBeProcessed.setPhotoUrl(req.queryParams("bphoto"));
				businessToBeProcessed.setCoordLat(req.queryParams("blat"));
				businessToBeProcessed.setCoordLong(req.queryParams("blong"));	
				
				//	Save it!
				businessDao.insertOrUpdateBusiness(businessToBeProcessed);
				res.status(200);	//successful if no errors.
			}catch(DaoException daoEx) {
				daoEx.printStackTrace();
				res.status(500);	//set status to 500 to indicate error
			}
			
			res.header("Access-Control-Allow-Headers","Content-Type");
			res.header("Access-Control-Allow-Methods","POST");
			res.header("Access-Control-Allow-Origin","http://localhost:8100");
			
			return res.status();
		});
	}
}
