package org.md.augmented.backend;

import org.md.augmented.backend.react.model.FitnessRoutine;
import org.md.augmented.backend.util.RoutineDataGenerator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Cameron
 */
@RestController
@RequestMapping(value = "/v0.1")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class BasicResource {

	/**
	 * 
	 * @param rountineId
	 * @return
	 */
	@RequestMapping(value = "/basicRoutine", method = RequestMethod.GET, produces = "application/json")
	public JsonNode basicRoutine(@RequestParam(value = "routineId") Integer routineId) {
		FitnessRoutine routine = RoutineDataGenerator.generateRoutine();
		JsonNode node = new ObjectMapper().valueToTree(routine);
		return node;
	}
}
