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
 * Regioncategory generated by hbm2java
 */
@Entity
@Table(name = "regioncategory", catalog = "photogenomeDatabase")
public class RegionCategory implements java.io.Serializable {

	private Integer regionCategoryId;
	private int regionId;
	private int photoId;
	private int userId;
	private String categoryName;
	private String regionCategoryText;
	private Date regionCategoryTimestamp;
	private Boolean regionCategoryIsdeleted;
	private String regionCategoryOption1;
	private String regionCategoryOption2;
	private String regionCategoryOption3;
	private String regionCategoryOption4;
	private String regionCategoryOption5;

	public RegionCategory() {
	}

	public RegionCategory(int regionId, int photoId, int userId,
			Date regionCategoryTimestamp) {
		this.regionId = regionId;
		this.photoId = photoId;
		this.userId = userId;
		this.regionCategoryTimestamp = regionCategoryTimestamp;
	}

	public RegionCategory(int regionId, int photoId, int userId,
			String categoryName, String regionCategoryText,
			Date regionCategoryTimestamp, Boolean regionCategoryIsdeleted,
			String regionCategoryOption1, String regionCategoryOption2,
			String regionCategoryOption3, String regionCategoryOption4,
			String regionCategoryOption5) {
		this.regionId = regionId;
		this.photoId = photoId;
		this.userId = userId;
		this.categoryName = categoryName;
		this.regionCategoryText = regionCategoryText;
		this.regionCategoryTimestamp = regionCategoryTimestamp;
		this.regionCategoryIsdeleted = regionCategoryIsdeleted;
		this.regionCategoryOption1 = regionCategoryOption1;
		this.regionCategoryOption2 = regionCategoryOption2;
		this.regionCategoryOption3 = regionCategoryOption3;
		this.regionCategoryOption4 = regionCategoryOption4;
		this.regionCategoryOption5 = regionCategoryOption5;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "regionCategory_id", unique = true, nullable = false)
	public Integer getRegionCategoryId() {
		return this.regionCategoryId;
	}

	public void setRegionCategoryId(Integer regionCategoryId) {
		this.regionCategoryId = regionCategoryId;
	}

	@Column(name = "region_id", nullable = false)
	public int getRegionId() {
		return this.regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
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

	@Column(name = "category_name", length = 65535)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "regionCategory_text", length = 65535)
	public String getRegionCategoryText() {
		return this.regionCategoryText;
	}

	public void setRegionCategoryText(String regionCategoryText) {
		this.regionCategoryText = regionCategoryText;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RegionCategory_timestamp", nullable = false, length = 19)
	public Date getRegionCategoryTimestamp() {
		return this.regionCategoryTimestamp;
	}

	public void setRegionCategoryTimestamp(Date regionCategoryTimestamp) {
		this.regionCategoryTimestamp = regionCategoryTimestamp;
	}

	@Column(name = "RegionCategory_isdeleted")
	public Boolean getRegionCategoryIsdeleted() {
		return this.regionCategoryIsdeleted;
	}

	public void setRegionCategoryIsdeleted(Boolean regionCategoryIsdeleted) {
		this.regionCategoryIsdeleted = regionCategoryIsdeleted;
	}

	@Column(name = "RegionCategory_option1", length = 65535)
	public String getRegionCategoryOption1() {
		return this.regionCategoryOption1;
	}

	public void setRegionCategoryOption1(String regionCategoryOption1) {
		this.regionCategoryOption1 = regionCategoryOption1;
	}

	@Column(name = "RegionCategory_option2", length = 65535)
	public String getRegionCategoryOption2() {
		return this.regionCategoryOption2;
	}

	public void setRegionCategoryOption2(String regionCategoryOption2) {
		this.regionCategoryOption2 = regionCategoryOption2;
	}

	@Column(name = "RegionCategory_option3", length = 65535)
	public String getRegionCategoryOption3() {
		return this.regionCategoryOption3;
	}

	public void setRegionCategoryOption3(String regionCategoryOption3) {
		this.regionCategoryOption3 = regionCategoryOption3;
	}

	@Column(name = "RegionCategory_option4", length = 65535)
	public String getRegionCategoryOption4() {
		return this.regionCategoryOption4;
	}

	public void setRegionCategoryOption4(String regionCategoryOption4) {
		this.regionCategoryOption4 = regionCategoryOption4;
	}

	@Column(name = "RegionCategory_option5", length = 65535)
	public String getRegionCategoryOption5() {
		return this.regionCategoryOption5;
	}

	public void setRegionCategoryOption5(String regionCategoryOption5) {
		this.regionCategoryOption5 = regionCategoryOption5;
	}

}
