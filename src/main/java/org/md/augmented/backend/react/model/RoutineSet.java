package org.md.augmented.backend.react.model;

/**
 * 
 * @author Cameron
 */
public class RoutineSet {

	private Double percent;
	private Integer reps;
	private Integer pounds;

	/**
	 * Empty constructor
	 */
	public RoutineSet() {
		// empty constructor
	}

	/**
	 * 
	 * @param reps
	 *            Integer number of repetitions
	 * @param pounds
	 *            Integer of pounds for set
	 * @param percent
	 *            Double of percent of maximum
	 */
	public RoutineSet(Integer reps, Integer pounds, Double percent) {
		super();
		this.percent = percent;
		this.reps = reps;
		this.pounds = pounds;
	}

	/**
	 * 
	 * @param obj
	 */
	public RoutineSet(RoutineSet obj) {
		super();
		if (obj != null) {
			this.percent = obj.percent;
			this.reps = obj.reps;
			this.pounds = obj.pounds;
		}
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public Integer getReps() {
		return reps;
	}

	public void setReps(Integer reps) {
		this.reps = reps;
	}

	public Integer getPounds() {
		return pounds;
	}

	public void setPounds(Integer pounds) {
		this.pounds = pounds;
	}

	@Override
	public String toString() {
		return "RoutineSet [percent=" + percent + ", reps=" + reps + ", pounds=" + pounds + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((percent == null) ? 0 : percent.hashCode());
		result = prime * result + ((pounds == null) ? 0 : pounds.hashCode());
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
		RoutineSet other = (RoutineSet) obj;
		if (percent == null) {
			if (other.percent != null) {
				return false;
			}
		} else if (!percent.equals(other.percent)) {
			return false;
		}
		if (pounds == null) {
			if (other.pounds != null) {
				return false;
			}
		} else if (!pounds.equals(other.pounds)) {
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
