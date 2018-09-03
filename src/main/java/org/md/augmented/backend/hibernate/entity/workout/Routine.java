package org.md.augmented.backend.hibernate.entity.workout;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_routine")
public class Routine {

	// @Id
	// @Column(name = "routine_id")
	private int id;
	// @Column(name = "session_id")
	private int sessionId;
	// @Column(name = "session_order")
	private Integer sessionOrder;
	// @Column(name = "exercise_id")
	private int exerciseId;
	// @Column(name = "routine_comment")
	private String comment;

	/**
	 * Empty constructor
	 */
	public Routine() {
		// emtpy constructor
	}

	/**
	 * 
	 * @param sessionId
	 * @param sessionOrder
	 * @param exerciseId
	 * @param comment
	 */
	public Routine(int sessionId, Integer sessionOrder, int exerciseId, String comment) {
		super();
		this.sessionId = sessionId;
		this.sessionOrder = sessionOrder;
		this.exerciseId = exerciseId;
		this.comment = comment;
	}

	/**
	 * 
	 * @param obj
	 */
	public Routine(Routine obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.sessionId = obj.sessionId;
			this.sessionOrder = obj.sessionOrder;
			this.exerciseId = obj.exerciseId;
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
		return "Routine [id=" + id + ", sessionId=" + sessionId + ", sessionOrder=" + sessionOrder + ", exerciseId="
				+ exerciseId + ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + exerciseId;
		result = prime * result + id;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
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
		Routine other = (Routine) obj;
		if (exerciseId != other.exerciseId) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (comment == null) {
			if (other.comment != null) {
				return false;
			}
		} else if (!comment.equals(other.comment)) {
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
