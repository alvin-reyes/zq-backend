//package com.zatiq.dao;
//
//import org.jooq.DSLContext;
//import org.jooq.Result;
//import org.jooq.SQLDialect;
//import org.jooq.impl.DSL;
//import org.springframework.stereotype.Repository;
//
//import com.areyes.jooq.gen.tables.Patients;
//import com.areyes.jooq.gen.tables.records.PatientsRecord;
//import com.zatiq.obj.Member;
//
//@Repository
//public class ErPatientsDaoImpl extends BaseDao {
//	
//	public Result<PatientsRecord> getAllPatients() {
//		try {
//			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
//			Result<PatientsRecord> result = create.selectFrom(Patients.PATIENTS).fetch();
//			return result;
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	
//	public Result<PatientsRecord> getAllPatientsOfMember(Member member) {
//		
//		try {
//			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
//			Result<PatientsRecord> patientAllForMember = create.selectFrom(Patients.PATIENTS).where(Patients.PATIENTS.MEMBER.equals(member)).fetch();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return null;
//	}
//	
//}
