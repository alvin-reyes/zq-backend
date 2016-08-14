/*
 * 
 */
package com.zatiq.obj;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Business.
 */
public class Business implements Serializable  {
	
	/** The id. */
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The coord lat. */
	private String coordLat;
	
	/** The coord long. */
	private String coordLong;
	
	/** The photo url. */
	private String photoUrl;
	
	/**
	 * Gets the photo url.
	 *
	 * @return the photo url
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}
	
	/**
	 * Sets the photo url.
	 *
	 * @param photoUrl the new photo url
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the coord lat.
	 *
	 * @return the coord lat
	 */
	public String getCoordLat() {
		return coordLat;
	}
	
	/**
	 * Sets the coord lat.
	 *
	 * @param coordLat the new coord lat
	 */
	public void setCoordLat(String coordLat) {
		this.coordLat = coordLat;
	}
	
	/**
	 * Gets the coord long.
	 *
	 * @return the coord long
	 */
	public String getCoordLong() {
		return coordLong;
	}
	
	/**
	 * Sets the coord long.
	 *
	 * @param coordLong the new coord long
	 */
	public void setCoordLong(String coordLong) {
		this.coordLong = coordLong;
	}
	
	/** The business meta data. */
	private String businessMetaData;
	
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
	 * Gets the business meta data.
	 *
	 * @return the business meta data
	 */
	public String getBusinessMetaData() {
		return businessMetaData;
	}
	
	/**
	 * Sets the business meta data.
	 *
	 * @param businessMetaData the new business meta data
	 */
	public void setBusinessMetaData(String businessMetaData) {
		this.businessMetaData = businessMetaData;
	}
	
	

}
