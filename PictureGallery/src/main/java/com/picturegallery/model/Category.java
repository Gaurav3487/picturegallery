package com.picturegallery.model;



import java.sql.Blob;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="categoryid")
	private int categoryid;
	@Column(name="categoryname")
	private String categoryname;
	@Column(name="categorypicture")
	private Blob categorypicture;
	
	
   
	@ManyToOne(cascade=CascadeType.ALL)
	private Food food;
	
    
    public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}


	public String getCategoryname() {
		return categoryname;
	}


	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}


	public Blob getCategorypicture() {
		return categorypicture;
	}


	public void setCategorypicture(Blob categorypicture) {
		this.categorypicture = categorypicture;
	}


	public Food getFood() {
		return food;
	}


	public void setFood(Food food) {
		this.food = food;
	}


	public Landscapes getLandscapes() {
		return landscapes;
	}


	public void setLandscapes(Landscapes landscapes) {
		this.landscapes = landscapes;
	}


	@ManyToOne(cascade=CascadeType.ALL)
	private Landscapes landscapes;
}
