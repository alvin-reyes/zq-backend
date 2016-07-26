//package com.zatiq.service;
//
//import static spark.Spark.*;
//
//import java.sql.Time;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.zatiq.dao.ErTeamDaoImpl;
//import com.zatiq.obj.Team;
//
//@Service
//public class ErLoadTeamService {
//	
//	@Autowired
//	private ErTeamDaoImpl erTeamDao;
//	private DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
//	
//	public ErLoadTeamService() {
//		
//		post("/teamservice/createnewteam",(req,res)-> {
//
//			Team team = new Team();
//			team.setName(req.queryParams("name"));
//			
//			System.out.println(dateFormat.parse(req.queryParams("shiftFrom")));
//			System.out.println(dateFormat.parse(req.queryParams("shiftTo")));
//			
//			team.setShiftFrom(new Time(0, 0, 0));
//			team.setShiftTo(new Time(0, 0, 0));
//			
//			//	Insert.
//			res.header("Access-Control-Allow-Headers","Content-Type");
//			res.header("Access-Control-Allow-Methods","POST");
//			res.header("Access-Control-Allow-Origin","*");
//			
//			return erTeamDao.insertTeam(team).formatJSON();
//		});
//		
//		get("/teamservice/updateteam",(req,res)-> {
//			
//			Team team = new Team();
//			team.setName(">>>>");
//			team.setShiftFrom(new Time(0, 0, 0));
//			team.setShiftTo(new Time(0, 0, 0));
//			erTeamDao.insertTeam(team);
//			
//			return "hello world1";
//		});
//		
//		get("/teamservice/getallteams", (req,res)-> {
//			res.type("application/json");
//			res.header("Access-Control-Allow-Headers", "Content-Type");
//			res.header("Access-Control-Allow-Methods", "GET");
//			res.header("Access-Control-Allow-Origin", "*");
//			
//			return erTeamDao.getAllTeams().formatJSON();
//		});
//		
//		get("/teamservice/getallteamswithmembers", (req,res)-> {
//			return "";
//		});
//		
//		
//	}
//	
//}
