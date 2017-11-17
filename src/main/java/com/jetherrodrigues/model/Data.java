package com.jetherrodrigues.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jetherrodrigues.util.GsonSingleton;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	private double temperature;
	private String wind_direction;
	private double wind_velocity;
	private double humidity;
	private String condition;
	private double pressure;
	private String icon;
	private double sensation;
	private String date;

	public Data() {
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getWind_direction() {
		return wind_direction;
	}

	public void setWind_direction(String wind_direction) {
		this.wind_direction = wind_direction;
	}

	public double getWind_velocity() {
		return wind_velocity;
	}

	public void setWind_velocity(double wind_velocity) {
		this.wind_velocity = wind_velocity;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public double getSensation() {
		return sensation;
	}

	public void setSensation(double sensation) {
		this.sensation = sensation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}
}
