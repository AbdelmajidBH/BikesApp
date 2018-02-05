package com.springbootangular4.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
public class Product  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
    private String productName;
    private String productCode;
    private Date releaseDate;
    private String description;
    private Double price;
    private Double starRating;
    private String imageUrl;
    
    
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String productName, String productCode, Date releaseDate, String description, Double price,
			Double starRating, String imageUrl) {
		
		this.productName = productName;
		this.productCode = productCode;
		this.releaseDate = releaseDate;
		this.description = description;
		this.price = price;
		this.starRating = starRating;
		this.imageUrl = imageUrl;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	//@JsonSerialize(using=JsonDateSerializer.class)
	public Date getReleaseDate() {
		return releaseDate;
	}

	@JsonSerialize(using=JsonDateSerializer.class)
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Double getStarRating() {
		return starRating;
	}


	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public Integer getProductId() {
		return productId;
	}
	
    
    

}
