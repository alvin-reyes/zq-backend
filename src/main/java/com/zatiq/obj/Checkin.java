package com.zatiq.obj;

import java.io.Serializable;

public class Checkin implements Serializable  {
	private Integer id;
	private Business business;
	private Integer checkin;
	private User user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public Integer getCheckin() {
		return checkin;
	}
	public void setCheckin(Integer checkin) {
		this.checkin = checkin;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
