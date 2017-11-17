package com.jetherrodrigues.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jetherrodrigues.util.GsonSingleton;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	private int id;
	private String name;
	private String state;
	private String country;

	public City() {
	}

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}
}
