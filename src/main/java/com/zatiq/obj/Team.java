/*
 * 
 */
package com.zatiq.obj;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Team.
 */
public class Team implements Serializable {
	
	/** The id. */
	private int id;
	
	/** The name. */
	private String name;
	
	/** The shift from. */
	private Time shiftFrom;
	
	/** The shift to. */
	private Time shiftTo;
	
	/** The members. */
	private List<Member> members;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
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
	 * Gets the shift from.
	 *
	 * @return the shift from
	 */
	public Time getShiftFrom() {
		return shiftFrom;
	}
	
	/**
	 * Sets the shift from.
	 *
	 * @param shiftFrom the new shift from
	 */
	public void setShiftFrom(Time shiftFrom) {
		this.shiftFrom = shiftFrom;
	}
	
	/**
	 * Gets the shift to.
	 *
	 * @return the shift to
	 */
	public Time getShiftTo() {
		return shiftTo;
	}
	
	/**
	 * Sets the shift to.
	 *
	 * @param shiftTo the new shift to
	 */
	public void setShiftTo(Time shiftTo) {
		this.shiftTo = shiftTo;
	}

	

}
