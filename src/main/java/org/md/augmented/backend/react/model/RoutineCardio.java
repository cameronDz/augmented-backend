package org.md.augmented.backend.react.model;

/**
 * 
 * @author Cameron
 */
public class RoutineCardio {

	private String name;
	private String note;
	private Double distance;
	private Integer time;
	private Integer count;

	/**
	 * Empty constructor
	 */
	public RoutineCardio() {
		// empty constructor
	}

	/**
	 * 
	 * @param name
	 * @param note
	 * @param distance
	 * @param time
	 * @param count
	 */
	public RoutineCardio(String name, Integer time, Double distance, Integer count, String note) {
		super();
		this.name = name;
		this.note = note;
		this.distance = distance;
		this.time = time;
		this.count = count;
	}

	/**
	 * 
	 * @param obj
	 */
	public RoutineCardio(RoutineCardio obj) {
		super();
		if (obj != null) {
			this.name = obj.name;
			this.note = obj.note;
			this.time = obj.time;
			this.distance = obj.distance;
			this.count = obj.count;
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

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "RoutineCardio [name=" + name + ", note=" + note + ", distance=" + distance + ", time=" + time
				+ ", count=" + count + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((distance == null) ? 0 : distance.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		RoutineCardio other = (RoutineCardio) obj;
		if (count == null) {
			if (other.count != null) {
				return false;
			}
		} else if (!count.equals(other.count)) {
			return false;
		}
		if (distance == null) {
			if (other.distance != null) {
				return false;
			}
		} else if (!distance.equals(other.distance)) {
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
		if (time == null) {
			if (other.time != null) {
				return false;
			}
		} else if (!time.equals(other.time)) {
			return false;
		}
		return true;
	}
}