package com.zatiq.obj;

import java.io.Serializable;

public class Rating  implements Serializable  {
	private Integer id;
	private Business business;
	private Double rating;
	private Integer ratingTypeId;
	private User user;
	
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getRatingTypeId() {
		return ratingTypeId;
	}
	public void setRatingTypeId(Integer ratingTypeId) {
		this.ratingTypeId = ratingTypeId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
