package com.picturegallery.model;



import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="food")
public class Food {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="foodid")
	private int id;
	
	@Column(name="foodname")
	private String foodname;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getFooddescription() {
		return fooddescription;
	}

	public void setFooddescription(String fooddescription) {
		this.fooddescription = fooddescription;
	}

	public Blob getFoodimage() {
		return foodimage;
	}

	public void setFoodimage(Blob foodimage) {
		this.foodimage = foodimage;
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

	@Column(name="description")
	private String fooddescription;
	
	@Column(name="image")
	private Blob foodimage;
	
	@Column(name="pictureauthor")
	private String pictureauthor;
	
	@Column(name="link")
	private String link;

}
