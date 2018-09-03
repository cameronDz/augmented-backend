package org.md.augmented.backend.util;

import org.junit.Test;
import org.md.augmented.backend.react.model.FitnessRoutine;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RoutineDataGeneratorTest {

	@Test
	public void test() {
		FitnessRoutine routine = RoutineDataGenerator.generateRoutine();
		JsonNode node = new ObjectMapper().valueToTree(routine);
		System.out.println(node.toString());
	}

}
