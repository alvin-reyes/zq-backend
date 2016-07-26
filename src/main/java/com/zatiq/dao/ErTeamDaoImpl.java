//package com.zatiq.dao;
//
//import org.jooq.DSLContext;
//import org.jooq.Record;
//import org.jooq.Result;
//import org.jooq.SQLDialect;
//import org.jooq.impl.DSL;
//import org.modelmapper.ModelMapper;
//import org.springframework.stereotype.Repository;
//
//import com.areyes.jooq.gen.tables.Teams;
//import com.areyes.jooq.gen.tables.records.TeamsRecord;
//import com.zatiq.obj.Team;
//
//@Repository
//public class ErTeamDaoImpl extends BaseDao {
//	
//	public Result<TeamsRecord> getAllTeams() {
//		try {
//			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
//			Result<TeamsRecord> result = create.selectFrom(Teams.TEAMS).fetch();
//			return result;
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	
//	public Result<TeamsRecord> insertTeam(Team team) {
//		try {
//			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
//			Result<TeamsRecord> result = create.insertInto(Teams.TEAMS).values(null,team.getName(),team.getShiftFrom(), team.getShiftTo()).returning().fetch();
//			
//			return result;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public void updateTeam(Team team) {
//		try {
//			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
//			create.update(Teams.TEAMS)
//				.set(Teams.TEAMS.NAME,team.getName())
//				.set(Teams.TEAMS.SHIFT_FROM,team.getShiftFrom())
//				.set(Teams.TEAMS.SHIFT_TO,team.getShiftTo());
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//}
