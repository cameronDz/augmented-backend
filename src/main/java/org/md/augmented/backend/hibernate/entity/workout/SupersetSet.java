package org.md.augmented.backend.hibernate.entity.workout;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_superset_set")
public class SupersetSet {

	// @Id
	// @Column(name = "superset_set_id")
	private int id;
	// @Column(name = "superset_routine_id")
	private int supersetRoutineId;
	// @Column(name = "superset_routine_order")
	private Integer supersetRoutineOrder;
	// @Column(name = "set_id")
	private int setId;

	/**
	 * 
	 */
	public SupersetSet() {
		// empty constructor
	}

	/**
	 * 
	 * @param supersetRoutineId
	 * @param supersetRoutineOrder
	 * @param setId
	 */
	public SupersetSet(int supersetRoutineId, Integer supersetRoutineOrder, int setId) {
		super();
		this.supersetRoutineId = supersetRoutineId;
		this.supersetRoutineOrder = supersetRoutineOrder;
		this.setId = setId;
	}

	/**
	 * 
	 * @param obj
	 */
	public SupersetSet(SupersetSet obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.supersetRoutineId = obj.supersetRoutineId;
			this.supersetRoutineOrder = obj.supersetRoutineOrder;
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
	public int getSupersetRoutineId() {
		return supersetRoutineId;
	}

	/**
	 * 
	 * @param supersetRoutineId
	 */
	public void setSupersetRoutineId(int supersetRoutineId) {
		this.supersetRoutineId = supersetRoutineId;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getSupersetRoutineOrder() {
		return supersetRoutineOrder;
	}

	/**
	 * 
	 * @param supersetRoutineOrder
	 */
	public void setSupersetRoutineOrder(Integer supersetRoutineOrder) {
		this.supersetRoutineOrder = supersetRoutineOrder;
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
		return "SupersetSet [id=" + id + ", supersetRoutineId=" + supersetRoutineId + ", supersetRoutineOrder="
				+ supersetRoutineOrder + ", setId=" + setId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + setId;
		result = prime * result + supersetRoutineId;
		result = prime * result + ((supersetRoutineOrder == null) ? 0 : supersetRoutineOrder.hashCode());
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
		SupersetSet other = (SupersetSet) obj;
		if (id != other.id) {
			return false;
		}
		if (setId != other.setId) {
			return false;
		}
		if (supersetRoutineId != other.supersetRoutineId) {
			return false;
		}
		if (supersetRoutineOrder == null) {
			if (other.supersetRoutineOrder != null) {
				return false;
			}
		} else if (!supersetRoutineOrder.equals(other.supersetRoutineOrder)) {
			return false;
		}
		return true;
	}
}
