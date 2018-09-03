package org.md.augmented.backend.hibernate.entity.workout;

import java.sql.Timestamp;

/**
 * 
 * @author Cameron
 */
// @Entity
// @Table(name = "t_session")
public class Session {

	// @Id
	// @Column(name = "session_id")
	private int id;
	// @Column(name = "start_time")
	private Timestamp startTime;
	// @Column(name = "end_time")
	private Timestamp endTime;
	// @Column(name = "session_comment")
	private String comment;

	/**
	 * Empty constructor
	 */
	public Session() {
		// empty constructor
	}

	/**
	 * 
	 * @param startTime
	 * @param endTime
	 * @param sessionComment
	 */
	public Session(Timestamp startTime, Timestamp endTime, String comment) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.comment = comment;
	}

	/**
	 * 
	 * @param obj
	 */
	public Session(Session obj) {
		super();
		if (obj != null) {
			this.id = obj.id;
			this.startTime = obj.startTime;
			this.endTime = obj.endTime;
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
	public Timestamp getStartTime() {
		return startTime;
	}

	/**
	 * 
	 * @param startTime
	 */
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	/**
	 * 
	 * @return
	 */
	public Timestamp getEndTime() {
		return endTime;
	}

	/**
	 * 
	 * @param endTime
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
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
	public void sesComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Session [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + id;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		Session other = (Session) obj;
		if (endTime == null) {
			if (other.endTime != null) {
				return false;
			}
		} else if (!endTime.equals(other.endTime)) {
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
		if (startTime == null) {
			if (other.startTime != null) {
				return false;
			}
		} else if (!startTime.equals(other.startTime)) {
			return false;
		}
		return true;
	}
}
