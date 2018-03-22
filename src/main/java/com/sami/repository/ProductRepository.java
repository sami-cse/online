package com.sami.repository;

import java.util.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sami.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByProductId(int productId);
	
	@Query(value = "SELECT * FROM Product WHERE CategoryId=?1 ", nativeQuery = true)
	List<Product> getProductsByCategoryId(Integer categoryId);

	@Query("SELECT SUM(p.views) FROM Product p")
	Integer countProductViews();
	
	@Query("SELECT COUNT(p) FROM Product p")
	Integer countProducts();
}
