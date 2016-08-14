/*
 * 
 */
package com.zatiq.obj;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Checkin.
 */
public class Checkin implements Serializable  {
	
	/** The id. */
	private Integer id;
	
	/** The business. */
	private Business business;
	
	/** The checkin. */
	private Integer checkin;
	
	/** The user. */
	private User user;
	
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
	 * Gets the checkin.
	 *
	 * @return the checkin
	 */
	public Integer getCheckin() {
		return checkin;
	}
	
	/**
	 * Sets the checkin.
	 *
	 * @param checkin the new checkin
	 */
	public void setCheckin(Integer checkin) {
		this.checkin = checkin;
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
}
