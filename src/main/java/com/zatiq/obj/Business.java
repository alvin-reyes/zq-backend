package com.zatiq.obj;

import java.io.Serializable;

public class Business implements Serializable  {
	private Integer id;
	private String name;
	private String coordLat;
	private String coordLong;
	private String photoUrl;
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoordLat() {
		return coordLat;
	}
	public void setCoordLat(String coordLat) {
		this.coordLat = coordLat;
	}
	public String getCoordLong() {
		return coordLong;
	}
	public void setCoordLong(String coordLong) {
		this.coordLong = coordLong;
	}
	private String businessMetaData;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBusinessMetaData() {
		return businessMetaData;
	}
	public void setBusinessMetaData(String businessMetaData) {
		this.businessMetaData = businessMetaData;
	}
	
	

}
