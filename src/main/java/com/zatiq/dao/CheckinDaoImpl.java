package com.zatiq.dao;

import java.sql.SQLException;
import java.util.Calendar;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import com.zatiq.dao.filter.CheckinFilter;
import com.zatiq.jooq.gen.tables.BusinessCheckin;
import com.zatiq.jooq.gen.tables.records.BusinessCheckinRecord;
import com.zatiq.obj.Checkin;

@Repository
public class CheckinDaoImpl extends BaseDao {
	
	public void insertOrUpdateCheckin(Checkin checkin) {
		try {
			// We need to check first if this is an update or not. So Let's
			// check if the rating id is 0 or now.
			if (checkin.getId() == -1) {
				// Date
				DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
				// create.insertInto(Teams.TEAMS).values(null,team.getName(),team.getShiftFrom(),
				create.insertInto(BusinessCheckin.BUSINESS_CHECKIN)
						.values(checkin.getBusiness().getId(), 
								checkin.getCheckin(),
								checkin.getUser().getId(), 
								"BETA", 
								"BETA",
								new java.sql.Date(Calendar.getInstance().getTime().getTime()),
								new java.sql.Date(Calendar.getInstance().getTime().getTime()))
						.execute();
				// team.getShiftTo()).execute();
			} else {
				DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
				create.update(BusinessCheckin.BUSINESS_CHECKIN)
						.set(BusinessCheckin.BUSINESS_CHECKIN.CHECKED_IN, checkin.getCheckin())
						.where(BusinessCheckin.BUSINESS_CHECKIN.ID.equals(checkin.getId()));
			}

		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
	}

	public Result<BusinessCheckinRecord> getCheckins(CheckinFilter review) {
		return null;
	}
}
