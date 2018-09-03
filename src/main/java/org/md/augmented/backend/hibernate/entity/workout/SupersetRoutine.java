package org.md.augmented.backend.hibernate.entity.workout;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_superset_routine")
public class SupersetRoutine {

	// @Id
	// @Column(name = "superset_routine_id")
	private int id;
	// @Column(name = "exercise_id")
	private int exerciseId;
	// @Column(name = "superset_id")
	private int supersetId;
	// @Column(name = "superset_order")
	private Integer supersetOrder;

	/**
	 * Empty constructor
	 */
	public SupersetRoutine() {
		// empty constructor
	}

	/**
	 * 
	 * @param exerciseId
	 * @param supersetId
	 * @param supersetOrder
	 */
	public SupersetRoutine(int exerciseId, int supersetId, Integer supersetOrder) {
		super();
		this.exerciseId = exerciseId;
		this.supersetId = supersetId;
		this.supersetOrder = supersetOrder;
	}

	/**
	 * 
	 * @param obj
	 */
	public SupersetRoutine(SupersetRoutine obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.exerciseId = obj.exerciseId;
			this.supersetId = obj.supersetId;
			this.supersetOrder = obj.supersetOrder;
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
	public int getExerciseId() {
		return exerciseId;
	}

	/**
	 * 
	 * @param exerciseId
	 */
	public void setExerciseId(int exerciseId) {
		this.exerciseId = exerciseId;
	}

	/**
	 * 
	 * @return
	 */
	public int getSupersetId() {
		return supersetId;
	}

	/**
	 * 
	 * @param supersetId
	 */
	public void setSupersetId(int supersetId) {
		this.supersetId = supersetId;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getSupersetOrder() {
		return supersetOrder;
	}

	/**
	 * 
	 * @param supersetOrder
	 */
	public void setSupersetOrder(Integer supersetOrder) {
		this.supersetOrder = supersetOrder;
	}

	@Override
	public String toString() {
		return "SupersetRoutine [id=" + id + ", exerciseId=" + exerciseId + ", supersetId=" + supersetId
				+ ", supersetOrder=" + supersetOrder + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + exerciseId;
		result = prime * result + id;
		result = prime * result + supersetId;
		result = prime * result + ((supersetOrder == null) ? 0 : supersetOrder.hashCode());
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
		SupersetRoutine other = (SupersetRoutine) obj;
		if (exerciseId != other.exerciseId) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (supersetId != other.supersetId) {
			return false;
		}
		if (supersetOrder == null) {
			if (other.supersetOrder != null) {
				return false;
			}
		} else if (!supersetOrder.equals(other.supersetOrder)) {
			return false;
		}
		return true;
	}
}
