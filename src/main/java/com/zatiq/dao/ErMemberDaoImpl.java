//package com.zatiq.dao;
//
//import org.jooq.DSLContext;
//import static com.areyes.jooq.gen.tables.Members.*;
//import org.jooq.Record;
//import org.jooq.Result;
//import org.jooq.SQLDialect;
//import org.jooq.impl.DSL;
//import org.springframework.stereotype.Repository;
//
//import com.zatiq.jooq.gen.tables.Teams;
//import com.areyes.jooq.gen.tables.records.MembersRecord;
//import com.areyes.jooq.gen.tables.records.TeamsRecord;
//import com.zatiq.obj.Member;
//import com.zatiq.obj.Team;
//
//@Repository
//public class ErMemberDaoImpl extends BaseDao {
//	
//	public Result<MembersRecord> getAllMembers() {
//		try {
//			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
//			Result<MembersRecord> result = create.selectFrom(MEMBERS).fetch();
//			
//			return result;
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	
//	public void insertMember(Member member) {
//		try {
//			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
//			//create.insertInto(Teams.TEAMS).values(null,team.getName(),team.getShiftFrom(), team.getShiftTo()).execute();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void updateMember(Member member) {
//		try {
//			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
////			create.update(Teams.TEAMS)
////				.set(Teams.TEAMS.NAME,team.getName())
////				.set(Teams.TEAMS.SHIFT_FROM,team.getShiftFrom())
////				.set(Teams.TEAMS.SHIFT_TO,team.getShiftTo());
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//}
