package org.md.augmented.backend.hibernate.entity.workout;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_exercise")
public class Exercise {

	// @Id
	// @Column(name = "exercise_id")
	private int id;
	// @Column(name = "exercise_type")
	private String type;
	// @Column(name = "exercise_name")
	private String name;
	// @Column(name = "exercise_description")
	private String description;

	/**
	 * Empty constructor
	 */
	public Exercise() {
		// empty constructor
	}

	/**
	 * 
	 * @param type
	 * @param name
	 * @param description
	 */
	public Exercise(String type, String name, String description) {
		super();
		this.type = type;
		this.name = name;
		this.description = description;
	}

	/**
	 * 
	 * @param obj
	 */
	public Exercise(Exercise obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.type = obj.type;
			this.name = obj.name;
			this.description = obj.description;
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

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Exercise [id=" + id + ", type=" + type + ", name=" + name + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Exercise other = (Exercise) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
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
