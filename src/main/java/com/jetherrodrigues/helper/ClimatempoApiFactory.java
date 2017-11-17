package com.jetherrodrigues.helper;

import static com.jetherrodrigues.util.Constants.CLIMATEMPO_URL;
import static com.jetherrodrigues.util.Constants.TOKEN;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jetherrodrigues.model.Weather;


/**
 * Jether Rois.
 * 
 * https://spring.io/guides/gs/consuming-rest/
 */
@Component
public final class ClimatempoApiFactory {

	public List<Object> getCitiesByUf(String uf) {
		StringBuilder builder = new StringBuilder();
		builder.append(CLIMATEMPO_URL);
		builder.append("locale/city?state=");
		builder.append(uf.toUpperCase());
		builder.append("&token=");
		builder.append(TOKEN);
		
		RestTemplate consumer = new RestTemplate();
		Object[] objects = consumer.getForObject(builder.toString(), Object[].class);
		
	    return Arrays.asList(objects);
	}

	public Weather getWeatherByCity(String cityCode) {
		StringBuilder builder = new StringBuilder();
		builder.append(CLIMATEMPO_URL);
		builder.append("weather/locale/");
		builder.append(cityCode);
		builder.append("/current?token=");
		builder.append(TOKEN);
		
		RestTemplate consumer = new RestTemplate();
		
		return consumer.getForObject(builder.toString(), Weather.class);
	}
}
