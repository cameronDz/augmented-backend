package org.md.augmented.backend.react.model;

/**
 * 
 * @author Cameron
 */
public class RoutineStretch {

	private String name;
	private Integer hold;
	private Integer reps;
	private String note;

	/**
	 * Empty constructor
	 */
	public RoutineStretch() {
		// empty constructor
	}

	/**
	 * 
	 * @param name
	 * @param hold
	 * @param reps
	 * @param note
	 */
	public RoutineStretch(String name, Integer hold, Integer reps, String note) {
		super();
		this.name = name;
		this.hold = hold;
		this.reps = reps;
		this.note = note;
	}

	/**
	 * 
	 * @param obj
	 */
	public RoutineStretch(RoutineStretch obj) {
		super();
		if (obj != null) {
			this.name = obj.name;
			this.hold = obj.hold;
			this.reps = obj.reps;
			this.note = obj.note;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHold() {
		return hold;
	}

	public void setHold(Integer hold) {
		this.hold = hold;
	}

	public Integer getReps() {
		return reps;
	}

	public void setReps(Integer reps) {
		this.reps = reps;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "RoutineStretch [name=" + name + ", hold=" + hold + ", reps=" + reps + ", note=" + note + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hold == null) ? 0 : hold.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((reps == null) ? 0 : reps.hashCode());
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
		RoutineStretch other = (RoutineStretch) obj;
		if (hold == null) {
			if (other.hold != null) {
				return false;
			}
		} else if (!hold.equals(other.hold)) {
			return false;
		}
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
		if (reps == null) {
			if (other.reps != null) {
				return false;
			}
		} else if (!reps.equals(other.reps)) {
			return false;
		}
		return true;
	}
}