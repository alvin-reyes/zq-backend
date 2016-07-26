package com.zatiq.obj;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

public class Team implements Serializable {
	
	private int id;
	private String name;
	private Time shiftFrom;
	private Time shiftTo;
	
	private List<Member> members;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Time getShiftFrom() {
		return shiftFrom;
	}
	public void setShiftFrom(Time shiftFrom) {
		this.shiftFrom = shiftFrom;
	}
	public Time getShiftTo() {
		return shiftTo;
	}
	public void setShiftTo(Time shiftTo) {
		this.shiftTo = shiftTo;
	}

	

}
