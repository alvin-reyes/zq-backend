/*
 * 
 */
package com.zatiq.obj;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Review.
 */
public class Review implements Serializable {
	
	/** The id. */
	private Integer id;
	
	/** The business. */
	private Business business;
	
	/** The review. */
	private String review;
	
	/** The user. */
	private User user;
	
	/**
	 * Gets the business.
	 *
	 * @return the business
	 */
	public Business getBusiness() {
		return business;
	}
	
	/**
	 * Sets the business.
	 *
	 * @param business the new business
	 */
	public void setBusiness(Business business) {
		this.business = business;
	}
	
	/**
	 * Gets the review.
	 *
	 * @return the review
	 */
	public String getReview() {
		return review;
	}
	
	/**
	 * Sets the review.
	 *
	 * @param review the new review
	 */
	public void setReview(String review) {
		this.review = review;
	}
	
	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	
	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
