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
 * Photocategory generated by hbm2java
 */
@Entity
@Table(name = "photocategory", catalog = "photogenomeDatabase")
public class PhotoCategory implements java.io.Serializable {

	private Integer photoCategoryId;
	private int photoId;
	private int userId;
	private String photoCategoryName;
	private String photoCategoryText;
	private Date photoCategoryTimestamp;
	private Boolean photoCategoryIsdeleted;
	private String photoCategoryOption1;
	private String photoCategoryOption2;
	private String photoCategoryOption3;
	private String photoCategoryOption4;
	private String photoCategoryOption5;

	public PhotoCategory() {
	}

	public PhotoCategory(int photoId, int userId, Date photoCategoryTimestamp) {
		this.photoId = photoId;
		this.userId = userId;
		this.photoCategoryTimestamp = photoCategoryTimestamp;
	}

	public PhotoCategory(int photoId, int userId, String photoCategoryName,
			String photoCategoryText, Date photoCategoryTimestamp,
			Boolean photoCategoryIsdeleted, String photoCategoryOption1,
			String photoCategoryOption2, String photoCategoryOption3,
			String photoCategoryOption4, String photoCategoryOption5) {
		this.photoId = photoId;
		this.userId = userId;
		this.photoCategoryName = photoCategoryName;
		this.photoCategoryText = photoCategoryText;
		this.photoCategoryTimestamp = photoCategoryTimestamp;
		this.photoCategoryIsdeleted = photoCategoryIsdeleted;
		this.photoCategoryOption1 = photoCategoryOption1;
		this.photoCategoryOption2 = photoCategoryOption2;
		this.photoCategoryOption3 = photoCategoryOption3;
		this.photoCategoryOption4 = photoCategoryOption4;
		this.photoCategoryOption5 = photoCategoryOption5;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "photoCategory_id", unique = true, nullable = false)
	public Integer getPhotoCategoryId() {
		return this.photoCategoryId;
	}

	public void setPhotoCategoryId(Integer photoCategoryId) {
		this.photoCategoryId = photoCategoryId;
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

	@Column(name = "photoCategory_name", length = 65535)
	public String getPhotoCategoryName() {
		return this.photoCategoryName;
	}

	public void setPhotoCategoryName(String photoCategoryName) {
		this.photoCategoryName = photoCategoryName;
	}

	@Column(name = "photoCategory_text", length = 65535)
	public String getPhotoCategoryText() {
		return this.photoCategoryText;
	}

	public void setPhotoCategoryText(String photoCategoryText) {
		this.photoCategoryText = photoCategoryText;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "photoCategory_timestamp", nullable = false, length = 19)
	public Date getPhotoCategoryTimestamp() {
		return this.photoCategoryTimestamp;
	}

	public void setPhotoCategoryTimestamp(Date photoCategoryTimestamp) {
		this.photoCategoryTimestamp = photoCategoryTimestamp;
	}

	@Column(name = "photoCategory_isdeleted")
	public Boolean getPhotoCategoryIsdeleted() {
		return this.photoCategoryIsdeleted;
	}

	public void setPhotoCategoryIsdeleted(Boolean photoCategoryIsdeleted) {
		this.photoCategoryIsdeleted = photoCategoryIsdeleted;
	}

	@Column(name = "photoCategory_option1", length = 65535)
	public String getPhotoCategoryOption1() {
		return this.photoCategoryOption1;
	}

	public void setPhotoCategoryOption1(String photoCategoryOption1) {
		this.photoCategoryOption1 = photoCategoryOption1;
	}

	@Column(name = "photoCategory_option2", length = 65535)
	public String getPhotoCategoryOption2() {
		return this.photoCategoryOption2;
	}

	public void setPhotoCategoryOption2(String photoCategoryOption2) {
		this.photoCategoryOption2 = photoCategoryOption2;
	}

	@Column(name = "photoCategory_option3", length = 65535)
	public String getPhotoCategoryOption3() {
		return this.photoCategoryOption3;
	}

	public void setPhotoCategoryOption3(String photoCategoryOption3) {
		this.photoCategoryOption3 = photoCategoryOption3;
	}

	@Column(name = "photoCategory_option4", length = 65535)
	public String getPhotoCategoryOption4() {
		return this.photoCategoryOption4;
	}

	public void setPhotoCategoryOption4(String photoCategoryOption4) {
		this.photoCategoryOption4 = photoCategoryOption4;
	}

	@Column(name = "photoCategory_option5", length = 65535)
	public String getPhotoCategoryOption5() {
		return this.photoCategoryOption5;
	}

	public void setPhotoCategoryOption5(String photoCategoryOption5) {
		this.photoCategoryOption5 = photoCategoryOption5;
	}

}
