package org.md.augmented.backend.react.model;

import java.util.List;

/**
 * 
 * @author Cameron
 */
public class FitnessRoutine {

	private String name;
	private String note;
	private Integer count;
	private List<RoutineExercise> exercises;

	/**
	 * Empty constructor
	 */
	public FitnessRoutine() {
		// empty constructor
	}

	public FitnessRoutine(String name, List<RoutineExercise> exercises, Integer count, String note) {
		super();
		this.name = name;
		this.note = note;
		this.count = count;
		this.exercises = exercises;
	}

	/**
	 * 
	 * @param obj
	 */
	public FitnessRoutine(FitnessRoutine obj) {
		super();
		if (obj != null) {
			this.name = obj.name;
			this.note = obj.note;
			this.count = obj.count;
			this.exercises = obj.exercises;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<RoutineExercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<RoutineExercise> activites) {
		this.exercises = activites;
	}

	@Override
	public String toString() {
		return "FitnessRoutine [name=" + name + ", note=" + note + ", count=" + count + ", exercises=" + exercises
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((exercises == null) ? 0 : exercises.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		FitnessRoutine other = (FitnessRoutine) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (exercises == null) {
			if (other.exercises != null) {
				return false;
			}
		} else if (!exercises.equals(other.exercises)) {
			return false;
		}
		if (count == null) {
			if (other.count != null) {
				return false;
			}
		} else if (!count.equals(other.count)) {
			return false;
		}
		if (note == null) {
			if (other.note != null) {
				return false;
			}
		} else if (!note.equals(other.note)) {
			return false;
		}
		return true;
	}
}
