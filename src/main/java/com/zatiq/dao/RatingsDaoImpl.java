package com.zatiq.dao;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

import com.zatiq.dao.filter.RatingFilter;
import com.zatiq.dao.filter.ReviewFilter;
import com.zatiq.jooq.gen.tables.records.BusinessUserRatingRecord;
import com.zatiq.obj.Rating;

@Repository
public class RatingsDaoImpl extends BaseDao {
	
	public void insertOrUpdateRating(Rating review) {
		try {
			DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
			// create.insertInto(Teams.TEAMS).values(null,team.getName(),team.getShiftFrom(),
			// team.getShiftTo()).execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Result<BusinessUserRatingRecord> getRatings(RatingFilter review) {
		return null;
	}

}
