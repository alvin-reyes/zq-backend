/*
 * 
 */
package com.zatiq.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import com.zatiq.dao.filter.RatingFilter;
import com.zatiq.exceptions.DaoException;
import com.zatiq.jooq.gen.tables.BusinessUserRating;
import com.zatiq.jooq.gen.tables.records.BusinessUserRatingRecord;
import com.zatiq.obj.Rating;

// TODO: Auto-generated Javadoc
/**
 * The Class RatingsDaoImpl.
 */
@Repository
public class RatingsDaoImpl extends BaseDao {
	
	/**
	 * Insert or update rating.
	 *
	 * @param rating the rating
	 * @throws DaoException the dao exception
	 */
	public void insertOrUpdateRating(Rating rating) throws DaoException {
		try {
			//	We need to check first if this is an update or not. So Let's check if the rating id is 0 or now.
			if(rating.getId() == -1) {
			//UInteger, Double, UInteger, UInteger, String, String, Date, Date
				DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
				// create.insertInto(Teams.TEAMS).values(null,team.getName(),team.getShiftFrom(),
				create.insertInto(BusinessUserRating.BUSINESS_USER_RATING)
				.values(rating.getBusiness().getId(),
						rating.getRating(),
						rating.getRatingTypeId(),
						rating.getUser().getId(),
						"BETA",
						"BETA",
						new java.sql.Date(Calendar.getInstance().getTime().getTime()),
						new java.sql.Date(Calendar.getInstance().getTime().getTime()))
				.execute();
			// team.getShiftTo()).execute();
			}else {
				DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
				create.update(BusinessUserRating.BUSINESS_USER_RATING)
					.set(BusinessUserRating.BUSINESS_USER_RATING.RATING,rating.getRating())
					.where(BusinessUserRating.BUSINESS_USER_RATING.ID.equals(rating.getId()));
			}

		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
	}
	
	/**
	 * Gets the ratings.
	 *
	 * @param review the review
	 * @return the ratings
	 */
	public Result<BusinessUserRatingRecord> getRatings(RatingFilter review) {
		return null;
	}

}
