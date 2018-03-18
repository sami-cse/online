package com.sami.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CategoryId")
	private int categoryId;

	@Column(name = "CategoryName")
	private String categoryName;

	@Column(name = "CreatedBy")
	private String createdBy;

	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Column(name = "CreatedAt")
	private Date createdAt;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@Column(name = "UpdatedAt")
	private Date updatedAt;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
