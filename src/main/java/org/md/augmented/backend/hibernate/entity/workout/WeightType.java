package org.md.augmented.backend.hibernate.entity.workout;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_weight_type")
public class WeightType {

	// @Id
	// @Column(name = "weight_type_id")
	private int id;
	// @Column(name = "weight_type")
	private String type;

	/**
	 * Empty constructor
	 */
	public WeightType() {
		// empty constructor
	}

	/**
	 * 
	 * @param type
	 */
	public WeightType(String type) {
		super();
		this.type = type;
	}

	/**
	 * 
	 * @param obj
	 */
	public WeightType(WeightType obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.type = obj.type;
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
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeightType [id=" + id + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		WeightType other = (WeightType) obj;
		if (id != other.id) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}
}
