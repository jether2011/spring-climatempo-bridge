package com.jetherrodrigues.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jetherrodrigues.helper.ClimatempoApiFactory;
import com.jetherrodrigues.model.City;
import com.jetherrodrigues.model.Weather;

@Component
public class ClimatempoService {
	@Autowired
	private ClimatempoApiFactory factory;
	
	public List<City> getCitiesByUf(String uf){
		return factory.getCitiesByUf(uf);
	}
	
	public Weather getWeatherByCity(String cityCode) {
		return factory.getWeatherByCity(cityCode);
	}
}
