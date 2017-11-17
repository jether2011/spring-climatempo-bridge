package com.jetherrodrigues.resources;

import static com.jetherrodrigues.util.VersionUtil.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jetherrodrigues.model.Weather;
import com.jetherrodrigues.service.ClimatempoService;

/**
 * Jether Rois.
 */
@RestController
@RequestMapping(value = { REST_APP + VERSION_V1 + ROOT_PATH })
public class CimatempoResource {
	
	@Autowired
	private ClimatempoService climatempoService;
	
	@GetMapping("locale/{uf}")
	public ResponseEntity<List<Object>> getLocalesByUf(@PathVariable String uf){
		return new ResponseEntity<List<Object>>(climatempoService.getCitiesByUf(uf), HttpStatus.OK);
	}
	
	@GetMapping("weather/{cityCode}")
	public ResponseEntity<Weather> getWeatherByCityCode(@PathVariable String cityCode){
		return new ResponseEntity<Weather>(climatempoService.getWeatherByCity(cityCode), HttpStatus.OK);
	}
}
