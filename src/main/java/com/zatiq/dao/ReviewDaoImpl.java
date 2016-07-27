package com.zatiq.dao;

import java.sql.SQLException;
import java.util.Calendar;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import com.zatiq.dao.filter.ReviewFilter;
import com.zatiq.jooq.gen.tables.BusinessUserRating;
import com.zatiq.jooq.gen.tables.BusinessUserReview;
import com.zatiq.jooq.gen.tables.records.BusinessUserReviewRecord;
import com.zatiq.obj.Review;

@Repository
public class ReviewDaoImpl extends BaseDao {

	public void insertOrUpdateReview(Review review) {
		try {
			//	We need to check first if this is an update or not. So Let's check if the rating id is 0 or now.
			if(review.getId() == -1) {
			//UInteger, Double, UInteger, UInteger, String, String, Date, Date
				DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
				// create.insertInto(Teams.TEAMS).values(null,team.getName(),team.getShiftFrom(),
				create.insertInto(BusinessUserReview.BUSINESS_USER_REVIEW)
				.values(review.getBusiness().getId(),
						review.getReview(),
						review.getUser().getId(),
						"BETA",
						"BETA",
						new java.sql.Date(Calendar.getInstance().getTime().getTime()),
						new java.sql.Date(Calendar.getInstance().getTime().getTime()))
				.execute();
			// team.getShiftTo()).execute();
			}else {
				DSLContext create = DSL.using(this.getConnection(), SQLDialect.MYSQL);
				create.update(BusinessUserReview.BUSINESS_USER_REVIEW)
					.set(BusinessUserReview.BUSINESS_USER_REVIEW.REVIEW,review.getReview())
					.where(BusinessUserReview.BUSINESS_USER_REVIEW.ID.equals(review.getId()));
			}

		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
	}
	
	public Result<BusinessUserReviewRecord> getReviews(ReviewFilter review) {
		return null;
	}

}
