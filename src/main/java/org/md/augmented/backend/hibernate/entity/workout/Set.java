package org.md.augmented.backend.hibernate.entity.workout;

import java.sql.Time;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_set")
public class Set {

	// @Id
	// @Column(name = "set_id")
	private int id;
	// @Column(name = "reps")
	private Integer reps;
	// @Column(name = "weight")
	private Double weight;
	// @Column(name = "weight_type_id")
	private Integer weightTypeId;
	// @Column(name = "set_time")
	private Time time;
	// @Column(name = "set_comment")
	private String comment;

	/**
	 * Empty constructor
	 */
	public Set() {
		// empty constructor
	}

	/**
	 * 
	 * @param reps
	 * @param weight
	 * @param weightTypeId
	 * @param time
	 * @param comment
	 */
	public Set(Integer reps, Double weight, Integer weightTypeId, Time time, String comment) {
		super();
		this.reps = reps;
		this.weight = weight;
		this.weightTypeId = weightTypeId;
		this.time = time;
		this.comment = comment;
	}

	/**
	 * 
	 * @param obj
	 */
	public Set(Set obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.reps = obj.reps;
			this.weight = obj.weight;
			this.weightTypeId = obj.weightTypeId;
			this.time = obj.time;
			this.comment = obj.comment;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getReps() {
		return reps;
	}

	/**
	 * 
	 * @param reps
	 */
	public void setReps(Integer reps) {
		this.reps = reps;
	}

	/**
	 * 
	 * @return
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * 
	 * @param weight
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getWeightTypeId() {
		return weightTypeId;
	}

	/**
	 * 
	 * @param weightTypeId
	 */
	public void setWeightTypeId(Integer weightTypeId) {
		this.weightTypeId = weightTypeId;
	}

	/**
	 * 
	 * @return
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * 
	 * @param time
	 */
	public void setTime(Time time) {
		this.time = time;
	}

	/**
	 * 
	 * @return
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 
	 * @param comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Set [id=" + id + ", reps=" + reps + ", weight=" + weight + ", weightTypeId=" + weightTypeId + ", time="
				+ time + ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + id;
		result = prime * result + ((reps == null) ? 0 : reps.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		result = prime * result + ((weightTypeId == null) ? 0 : weightTypeId.hashCode());
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
		Set other = (Set) obj;
		if (comment == null) {
			if (other.comment != null) {
				return false;
			}
		} else if (!comment.equals(other.comment)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (reps == null) {
			if (other.reps != null) {
				return false;
			}
		} else if (!reps.equals(other.reps)) {
			return false;
		}
		if (time == null) {
			if (other.time != null) {
				return false;
			}
		} else if (!time.equals(other.time)) {
			return false;
		}
		if (weight == null) {
			if (other.weight != null) {
				return false;
			}
		} else if (!weight.equals(other.weight)) {
			return false;
		}
		if (weightTypeId == null) {
			if (other.weightTypeId != null) {
				return false;
			}
		} else if (!weightTypeId.equals(other.weightTypeId)) {
			return false;
		}
		return true;
	}
}
