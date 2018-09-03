package org.md.augmented.backend.hibernate.entity.workout;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_rountine_set")
public class RoutineSet {

	// @Id
	// @Column(name = "rountine_set_id")
	private int id;
	// @Column(name = "rountine_id")
	private int rountineId;
	// @Column(name = "rountine_order")
	private Integer routineOrder;
	// @Column(name = "set_id")
	private int setId;

	/**
	 * Empty constructor
	 */
	public RoutineSet() {
		// empty constructor
	}

	/**
	 * 
	 * @param rountineId
	 * @param routineOrder
	 * @param setId
	 */
	public RoutineSet(int rountineId, Integer routineOrder, int setId) {
		super();
		this.rountineId = rountineId;
		this.routineOrder = routineOrder;
		this.setId = setId;
	}

	/**
	 * 
	 * @param obj
	 */
	public RoutineSet(RoutineSet obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.rountineId = obj.rountineId;
			this.routineOrder = obj.routineOrder;
			this.setId = obj.setId;
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
	public int getRountineId() {
		return rountineId;
	}

	/**
	 * 
	 * @param rountineId
	 */
	public void setRountineId(int rountineId) {
		this.rountineId = rountineId;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getRoutineOrder() {
		return routineOrder;
	}

	/**
	 * 
	 * @param routineOrder
	 */
	public void setRoutineOrder(Integer routineOrder) {
		this.routineOrder = routineOrder;
	}

	/**
	 * 
	 * @return
	 */
	public int getSetId() {
		return setId;
	}

	/**
	 * 
	 * @param setId
	 */
	public void setSetId(int setId) {
		this.setId = setId;
	}

	@Override
	public String toString() {
		return "RoutineSet [id=" + id + ", rountineId=" + rountineId + ", routineOrder=" + routineOrder + ", setId="
				+ setId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + rountineId;
		result = prime * result + ((routineOrder == null) ? 0 : routineOrder.hashCode());
		result = prime * result + setId;
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
		if (id != other.id) {
			return false;
		}
		if (rountineId != other.rountineId) {
			return false;
		}
		if (routineOrder == null) {
			if (other.routineOrder != null) {
				return false;
			}
		} else if (!routineOrder.equals(other.routineOrder)) {
			return false;
		}
		if (setId != other.setId) {
			return false;
		}
		return true;
	}
}
