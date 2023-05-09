package com.picturegallery.model;



import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="landscapes")
public class Landscapes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pictureid")
	private int pictureid;
	
	@Column(name="picturename")
	private String picturename;

	@Column(name="picturedescription")
	private String picturedescripion;

	@Column(name="picture")
	private Blob picture;

	@Column(name="author")
	private String pictureauthor;

	@Column(name="link")
	private String link;

	public int getPictureid() {
		return pictureid;
	}

	public void setPictureid(int pictureid) {
		this.pictureid = pictureid;
	}

	public String getPicturename() {
		return picturename;
	}

	public void setPicturename(String picturename) {
		this.picturename = picturename;
	}

	public String getPicturedescripion() {
		return picturedescripion;
	}

	public void setPicturedescripion(String picturedescripion) {
		this.picturedescripion = picturedescripion;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public String getPictureauthor() {
		return pictureauthor;
	}

	public void setPictureauthor(String pictureauthor) {
		this.pictureauthor = pictureauthor;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
