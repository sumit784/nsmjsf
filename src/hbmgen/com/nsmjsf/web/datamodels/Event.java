package com.nsmjsf.web.datamodels;

// Generated Feb 28, 2015 11:53:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Event generated by hbm2java
 */
@Entity
@Table(name = "event", catalog = "admin_nsmjsf")
public class Event implements java.io.Serializable {

	private Integer eventId;
	private Post post;
	private Date eventStart;
	private Date eventEnd;
	private String eventOrganizer;

	public Event() {
	}

	public Event(Post post, Date eventStart, Date eventEnd,
			String eventOrganizer) {
		this.post = post;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
		this.eventOrganizer = eventOrganizer;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "event_id", unique = true, nullable = false)
	public Integer getEventId() {
		return this.eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "event_post_id", nullable = false)
	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "event_start", nullable = false, length = 0)
	public Date getEventStart() {
		return this.eventStart;
	}

	public void setEventStart(Date eventStart) {
		this.eventStart = eventStart;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "event_end", nullable = false, length = 0)
	public Date getEventEnd() {
		return this.eventEnd;
	}

	public void setEventEnd(Date eventEnd) {
		this.eventEnd = eventEnd;
	}

	@Column(name = "event_organizer", nullable = false)
	public String getEventOrganizer() {
		return this.eventOrganizer;
	}

	public void setEventOrganizer(String eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}

}