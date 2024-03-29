package edu.cmu.photogenome.domain;

// Generated May 24, 2013 3:47:50 PM by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Photocomment generated by hbm2java
 */
@Entity
@Table(name = "photocomment", catalog = "photogenomeDatabase")
public class PhotoComment implements java.io.Serializable {

	private Integer photoCommentId;
	private String photoCommentText;
	private int photoId;
	private int userId;
	private Date photoCommentTimestamp;
	private Boolean photoCommentIsdeleted;
	private String photoCommentOption1;
	private String photoCommentOption2;
	private String photoCommentOption3;
	private String photoCommentOption4;
	private String photoCommentOption5;

	public PhotoComment() {
	}

	public PhotoComment(int photoId, int userId, Date photoCommentTimestamp) {
		this.photoId = photoId;
		this.userId = userId;
		this.photoCommentTimestamp = photoCommentTimestamp;
	}

	public PhotoComment(String photoCommentText, int photoId, int userId,
			Date photoCommentTimestamp, Boolean photoCommentIsdeleted,
			String photoCommentOption1, String photoCommentOption2,
			String photoCommentOption3, String photoCommentOption4,
			String photoCommentOption5) {
		this.photoCommentText = photoCommentText;
		this.photoId = photoId;
		this.userId = userId;
		this.photoCommentTimestamp = photoCommentTimestamp;
		this.photoCommentIsdeleted = photoCommentIsdeleted;
		this.photoCommentOption1 = photoCommentOption1;
		this.photoCommentOption2 = photoCommentOption2;
		this.photoCommentOption3 = photoCommentOption3;
		this.photoCommentOption4 = photoCommentOption4;
		this.photoCommentOption5 = photoCommentOption5;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "photoComment_id", unique = true, nullable = false)
	public Integer getPhotoCommentId() {
		return this.photoCommentId;
	}

	public void setPhotoCommentId(Integer photoCommentId) {
		this.photoCommentId = photoCommentId;
	}

	@Column(name = "photoComment_text", length = 65535)
	public String getPhotoCommentText() {
		return this.photoCommentText;
	}

	public void setPhotoCommentText(String photoCommentText) {
		this.photoCommentText = photoCommentText;
	}

	@Column(name = "photo_id", nullable = false)
	public int getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PhotoComment_timestamp", nullable = false, length = 19)
	public Date getPhotoCommentTimestamp() {
		return this.photoCommentTimestamp;
	}

	public void setPhotoCommentTimestamp(Date photoCommentTimestamp) {
		this.photoCommentTimestamp = photoCommentTimestamp;
	}

	@Column(name = "PhotoComment_isdeleted")
	public Boolean getPhotoCommentIsdeleted() {
		return this.photoCommentIsdeleted;
	}

	public void setPhotoCommentIsdeleted(Boolean photoCommentIsdeleted) {
		this.photoCommentIsdeleted = photoCommentIsdeleted;
	}

	@Column(name = "PhotoComment_option1", length = 65535)
	public String getPhotoCommentOption1() {
		return this.photoCommentOption1;
	}

	public void setPhotoCommentOption1(String photoCommentOption1) {
		this.photoCommentOption1 = photoCommentOption1;
	}

	@Column(name = "PhotoComment_option2", length = 65535)
	public String getPhotoCommentOption2() {
		return this.photoCommentOption2;
	}

	public void setPhotoCommentOption2(String photoCommentOption2) {
		this.photoCommentOption2 = photoCommentOption2;
	}

	@Column(name = "PhotoComment_option3", length = 65535)
	public String getPhotoCommentOption3() {
		return this.photoCommentOption3;
	}

	public void setPhotoCommentOption3(String photoCommentOption3) {
		this.photoCommentOption3 = photoCommentOption3;
	}

	@Column(name = "PhotoComment_option4", length = 65535)
	public String getPhotoCommentOption4() {
		return this.photoCommentOption4;
	}

	public void setPhotoCommentOption4(String photoCommentOption4) {
		this.photoCommentOption4 = photoCommentOption4;
	}

	@Column(name = "PhotoComment_option5", length = 65535)
	public String getPhotoCommentOption5() {
		return this.photoCommentOption5;
	}

	public void setPhotoCommentOption5(String photoCommentOption5) {
		this.photoCommentOption5 = photoCommentOption5;
	}

}
