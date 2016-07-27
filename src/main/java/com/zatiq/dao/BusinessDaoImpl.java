package com.zatiq.dao;

import java.sql.SQLException;
import java.util.Calendar;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import com.zatiq.dao.filter.BusinessFilter;
import com.zatiq.jooq.gen.tables.records.BusinessRecord;
import com.zatiq.obj.Business;

@Repository
public class BusinessDaoImpl extends BaseDao {
	
	public void insertOrUpdateBusiness(Business business) {
		try {
			//	We need to check first if this is an update or not. So Let's check if the rating id is 0 or now.
			if(business.getId() == -1) {
			//UInteger, Double, UInteger, UInteger, String, String, Date, Date
				DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
				// create.insertInto(Teams.TEAMS).values(null,team.getName(),team.getShiftFrom(),
				create.insertInto(com.zatiq.jooq.gen.tables.Business.BUSINESS)
				.values(business.getName(),
						business.getBusinessMetaData(),
						"BETA",
						"BETA",
						new java.sql.Date(Calendar.getInstance().getTime().getTime()),
						new java.sql.Date(Calendar.getInstance().getTime().getTime()))
				.execute();
			}
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
	}
	
	public Result<BusinessRecord> getBusiness(BusinessFilter business) {
		return null;
	}
}
