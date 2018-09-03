package org.md.augmented.backend.react.model;

import java.util.List;

/**
 * 
 * @author Cameron
 */
public class RoutineExercise {

	private String name;
	private String note;
	private List<RoutineSet> sets;

	/**
	 * Empty constructor
	 */
	public RoutineExercise() {
		// empty constructor
	}

	/**
	 * 
	 * @param name
	 * @param note
	 * @param sets
	 */
	public RoutineExercise(String name, List<RoutineSet> sets, String note) {
		super();
		this.name = name;
		this.note = note;
		this.sets = sets;
	}

	/**
	 * 
	 * @param obj
	 */
	public RoutineExercise(RoutineExercise obj) {
		super();
		if (obj != null) {
			this.name = obj.name;
			this.note = obj.note;
			this.sets = obj.sets;
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

	public List<RoutineSet> getSets() {
		return sets;
	}

	public void setSets(List<RoutineSet> sets) {
		this.sets = sets;
	}

	@Override
	public String toString() {
		return "RoutineExercise [name=" + name + ", note=" + note + ", sets=" + sets + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((sets == null) ? 0 : sets.hashCode());
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
		RoutineExercise other = (RoutineExercise) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (note == null) {
			if (other.note != null) {
				return false;
			}
		} else if (!note.equals(other.note)) {
			return false;
		}
		if (sets == null) {
			if (other.sets != null) {
				return false;
			}
		} else if (!sets.equals(other.sets)) {
			return false;
		}
		return true;
	}
}