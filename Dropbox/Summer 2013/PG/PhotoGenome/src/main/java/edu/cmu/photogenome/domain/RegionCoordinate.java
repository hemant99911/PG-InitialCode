package edu.cmu.photogenome.domain;
// default package
// Generated May 27, 2013 2:50:42 PM by Hibernate Tools 4.0.0

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
 * Regioncoordinate generated by hbm2java
 */
@Entity
@Table(name = "regioncoordinate", catalog = "photogenomeDatabase")
public class RegionCoordinate implements java.io.Serializable {

	private Integer regionCoordinateId;
	private int regionId;
	private int photoId;
	private int userId;
	private int regionX;
	private int regionY;
	private int height;
	private int width;
	private Date regionCoordinateTimestamp;
	private Boolean regionCoordinateIsdeleted;
	private String regionCoordinateOption1;
	private String regionCoordinateOption2;
	private String regionCoordinateOption3;
	private String regionCoordinateOption4;
	private String regionCoordinateOption5;

	public RegionCoordinate() {
	}

	public RegionCoordinate(int regionId, int photoId, int userId, int regionX,
			int regionY, int height, int width, Date regionCoordinateTimestamp) {
		this.regionId = regionId;
		this.photoId = photoId;
		this.userId = userId;
		this.regionX = regionX;
		this.regionY = regionY;
		this.height = height;
		this.width = width;
		this.regionCoordinateTimestamp = regionCoordinateTimestamp;
	}

	public RegionCoordinate(int regionId, int photoId, int userId, int regionX,
			int regionY, int height, int width, Date regionCoordinateTimestamp,
			Boolean regionCoordinateIsdeleted, String regionCoordinateOption1,
			String regionCoordinateOption2, String regionCoordinateOption3,
			String regionCoordinateOption4, String regionCoordinateOption5) {
		this.regionId = regionId;
		this.photoId = photoId;
		this.userId = userId;
		this.regionX = regionX;
		this.regionY = regionY;
		this.height = height;
		this.width = width;
		this.regionCoordinateTimestamp = regionCoordinateTimestamp;
		this.regionCoordinateIsdeleted = regionCoordinateIsdeleted;
		this.regionCoordinateOption1 = regionCoordinateOption1;
		this.regionCoordinateOption2 = regionCoordinateOption2;
		this.regionCoordinateOption3 = regionCoordinateOption3;
		this.regionCoordinateOption4 = regionCoordinateOption4;
		this.regionCoordinateOption5 = regionCoordinateOption5;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "regionCoordinate_id", unique = true, nullable = false)
	public Integer getRegionCoordinateId() {
		return this.regionCoordinateId;
	}

	public void setRegionCoordinateId(Integer regionCoordinateId) {
		this.regionCoordinateId = regionCoordinateId;
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

	@Column(name = "region_x", nullable = false)
	public int getRegionX() {
		return this.regionX;
	}

	public void setRegionX(int regionX) {
		this.regionX = regionX;
	}

	@Column(name = "region_y", nullable = false)
	public int getRegionY() {
		return this.regionY;
	}

	public void setRegionY(int regionY) {
		this.regionY = regionY;
	}

	@Column(name = "height", nullable = false)
	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Column(name = "width", nullable = false)
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RegionCoordinate_timestamp", nullable = false, length = 19)
	public Date getRegionCoordinateTimestamp() {
		return this.regionCoordinateTimestamp;
	}

	public void setRegionCoordinateTimestamp(Date regionCoordinateTimestamp) {
		this.regionCoordinateTimestamp = regionCoordinateTimestamp;
	}

	@Column(name = "RegionCoordinate_isdeleted")
	public Boolean getRegionCoordinateIsdeleted() {
		return this.regionCoordinateIsdeleted;
	}

	public void setRegionCoordinateIsdeleted(Boolean regionCoordinateIsdeleted) {
		this.regionCoordinateIsdeleted = regionCoordinateIsdeleted;
	}

	@Column(name = "RegionCoordinate_option1", length = 65535)
	public String getRegionCoordinateOption1() {
		return this.regionCoordinateOption1;
	}

	public void setRegionCoordinateOption1(String regionCoordinateOption1) {
		this.regionCoordinateOption1 = regionCoordinateOption1;
	}

	@Column(name = "RegionCoordinate_option2", length = 65535)
	public String getRegionCoordinateOption2() {
		return this.regionCoordinateOption2;
	}

	public void setRegionCoordinateOption2(String regionCoordinateOption2) {
		this.regionCoordinateOption2 = regionCoordinateOption2;
	}

	@Column(name = "RegionCoordinate_option3", length = 65535)
	public String getRegionCoordinateOption3() {
		return this.regionCoordinateOption3;
	}

	public void setRegionCoordinateOption3(String regionCoordinateOption3) {
		this.regionCoordinateOption3 = regionCoordinateOption3;
	}

	@Column(name = "RegionCoordinate_option4", length = 65535)
	public String getRegionCoordinateOption4() {
		return this.regionCoordinateOption4;
	}

	public void setRegionCoordinateOption4(String regionCoordinateOption4) {
		this.regionCoordinateOption4 = regionCoordinateOption4;
	}

	@Column(name = "RegionCoordinate_option5", length = 65535)
	public String getRegionCoordinateOption5() {
		return this.regionCoordinateOption5;
	}

	public void setRegionCoordinateOption5(String regionCoordinateOption5) {
		this.regionCoordinateOption5 = regionCoordinateOption5;
	}

}
