package com.jetherrodrigues.helper;

import static com.jetherrodrigues.util.Constants.*;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jetherrodrigues.model.City;
import com.jetherrodrigues.model.Weather;

@Component
public final class ClimatempoApiFactory {
	
	@SuppressWarnings("unchecked")
	public List<City> getCitiesByUf(String uf){
		String url = CLIMATEMPO_URL + "locale/city?state=" + uf.toUpperCase() + "&token=" + TOKEN;
		RestTemplate consumer = new RestTemplate();
		return (List<City>) consumer.getForObject(url, City.class);
	}
	
	public Weather getWeatherByCity(String cityCode) {
		String url = CLIMATEMPO_URL + "weather/locale/" + cityCode + "/current?token=" + TOKEN;
		RestTemplate consumer = new RestTemplate();
		return consumer.getForObject(url, Weather.class);
	}
}
