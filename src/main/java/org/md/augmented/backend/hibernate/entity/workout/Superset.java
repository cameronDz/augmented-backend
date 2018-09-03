package org.md.augmented.backend.hibernate.entity.workout;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_superset")
public class Superset {

	// @Id
	// @Column(name = "superset_id")
	private int id;
	// @Column(name = "session_id")
	private int sessionId;
	// @Column(name = "session_order")
	private Integer sessionOrder;
	// @Column(name = "superset_comment")
	private String comment;

	/**
	 * Empty constructor
	 */
	public Superset() {
		// empty constructor
	}

	/**
	 * 
	 * @param sessionId
	 * @param sessionOrder
	 * @param comment
	 */
	public Superset(int sessionId, Integer sessionOrder, String comment) {
		super();
		this.sessionId = sessionId;
		this.sessionOrder = sessionOrder;
		this.comment = comment;
	}

	/**
	 * 
	 * @param obj
	 */
	public Superset(Superset obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.sessionId = obj.sessionId;
			this.sessionOrder = obj.sessionOrder;
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
	public int getSessionId() {
		return sessionId;
	}

	/**
	 * 
	 * @param sessionId
	 */
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getSessionOrder() {
		return sessionOrder;
	}

	/**
	 * 
	 * @param sessionOrder
	 */
	public void setSessionOrder(Integer sessionOrder) {
		this.sessionOrder = sessionOrder;
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
		return "Superset [id=" + id + ", sessionId=" + sessionId + ", sessionOrder=" + sessionOrder + ", comment="
				+ comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + id;
		result = prime * result + sessionId;
		result = prime * result + ((sessionOrder == null) ? 0 : sessionOrder.hashCode());
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
		Superset other = (Superset) obj;
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
		if (sessionId != other.sessionId) {
			return false;
		}
		if (sessionOrder == null) {
			if (other.sessionOrder != null) {
				return false;
			}
		} else if (!sessionOrder.equals(other.sessionOrder)) {
			return false;
		}
		return true;
	}
}
