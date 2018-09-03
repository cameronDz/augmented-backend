package org.md.augmented.backend.util;

import java.util.ArrayList;
import java.util.List;

import org.md.augmented.backend.react.model.FitnessRoutine;
import org.md.augmented.backend.react.model.RoutineExercise;
import org.md.augmented.backend.react.model.RoutineSet;

/**
 * 
 * @author Cameron
 */
public final class RoutineDataGenerator {

	/**
	 * 
	 * @return
	 */
	public static FitnessRoutine generateRoutine() {
		FitnessRoutine routine = new FitnessRoutine();
		routine.setName("Full Olympic Routine");
		routine.setExercises(generateRoutineExercises());
		routine.setCount(routine.getExercises().size());
		return routine;
	}

	private static List<RoutineExercise> generateRoutineExercises() {
		List<RoutineExercise> list = new ArrayList<RoutineExercise>();
		list.add(new RoutineExercise("Full Barbell Clean", generateRoutineSet(5, 5, .60), null));
		list.add(new RoutineExercise("Barbell Snatch Pull", generateRoutineSet(5, 3, .60), null));
		list.add(new RoutineExercise("Barbell Push Press", generateRoutineSet(5, 5, .60), null));
		return list;
	}

	private static List<RoutineSet> generateRoutineSet(Integer sets, Integer reps, Double percent) {
		List<RoutineSet> list = new ArrayList<RoutineSet>();
		for (int i = 0; i < sets; i++) {
			list.add(new RoutineSet(reps, null, percent));
		}
		return list;
	}
}
