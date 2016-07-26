package com.zatiq.service;

import static spark.Spark.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zatiq.dao.ErMemberDaoImpl;


@Service
public class ErloadMemberService {

	@Autowired
	private ErMemberDaoImpl erMemberDao;
	
	public ErloadMemberService() {
		get("/memberservice/getmembers",(res,req) -> {
			return "";
		});
		
		post("/memberservice/createnewmember",(res,req) -> {
			return "";
		});
		
	}
}
