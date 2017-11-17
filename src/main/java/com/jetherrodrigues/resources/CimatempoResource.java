package com.jetherrodrigues.resources;

import static com.jetherrodrigues.util.VersionUtil.*;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	public ResponseBody getLocalesByUf(@PathVariable String uf){
		return (ResponseBody) new HashMap<>().put("state", uf);
	}
	
	@GetMapping("locale/{city}/{uf}")
	public ResponseEntity<?> getLocaleByCity(@PathVariable String city, @PathVariable String uf){
		return ResponseEntity.status(HttpStatus.OK).body(new HashMap<>().put("city-uf", city + " - " + uf));
	}
}
