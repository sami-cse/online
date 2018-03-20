package com.sami.model;

import java.util.UUID;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProductId")
	private int productId;

	@Column(name = "ProductName")
	private String productName;

	@Column(name = "ProductPrize", nullable = true)
	private double productPrize = 0.0;

	@Column(name = "ProductCode")
	private String productCode;

	@Column(name = "ProductDescription")
	@JsonIgnore
	private String description;

	@Column(name = "ImageUrl")
	private String imageUrl;

	@Column(name = "ProductQuantity", nullable = true)
	private int quantity;

	@Column(name = "Active", nullable = true)
	@JsonIgnore
	private boolean active = true;

	@Column(name = "Purchases", nullable = true, columnDefinition = "int default 0")
	private int purchases = 0;

	@Column(name = "Views", nullable = true, columnDefinition = "int default 0")
	private int views = 0;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CategoryId", referencedColumnName = "CategoryId")
	@JsonIgnore
	private Category categoryId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BrandId", referencedColumnName = "BrandId")
	private Brand brandId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserId", referencedColumnName = "UserId")
	@JsonIgnore
	private User userId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Brand getBrandId() {
		return brandId;
	}

	public void setBrandId(Brand brandId) {
		this.brandId = brandId;
	}

}
