package com.nsmjsf.web.datamodels;

// Generated Feb 28, 2015 3:31:39 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PostLike generated by hbm2java
 */
@Entity
@Table(name = "post_like", catalog = "admin_nsmjsf")
public class PostLike implements java.io.Serializable {

	private Integer postLikeId;
	private Post post;
	private User user;

	public PostLike() {
	}

	public PostLike(Post post, User user) {
		this.post = post;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "post_like_id", unique = true, nullable = false)
	public Integer getPostLikeId() {
		return this.postLikeId;
	}

	public void setPostLikeId(Integer postLikeId) {
		this.postLikeId = postLikeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_like_post_id", nullable = false)
	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_like_user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}