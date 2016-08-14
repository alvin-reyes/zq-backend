/*
 * 
 */
package com.zatiq.obj;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Rating.
 */
public class Rating  implements Serializable  {
	
	/** The id. */
	private Integer id;
	
	/** The business. */
	private Business business;
	
	/** The rating. */
	private Double rating;
	
	/** The rating type id. */
	private Integer ratingTypeId;
	
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
	 * Gets the rating.
	 *
	 * @return the rating
	 */
	public Double getRating() {
		return rating;
	}
	
	/**
	 * Sets the rating.
	 *
	 * @param rating the new rating
	 */
	public void setRating(Double rating) {
		this.rating = rating;
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
	 * Gets the rating type id.
	 *
	 * @return the rating type id
	 */
	public Integer getRatingTypeId() {
		return ratingTypeId;
	}
	
	/**
	 * Sets the rating type id.
	 *
	 * @param ratingTypeId the new rating type id
	 */
	public void setRatingTypeId(Integer ratingTypeId) {
		this.ratingTypeId = ratingTypeId;
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
