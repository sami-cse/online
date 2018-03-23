package com.sami.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sami.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

	List<Brand> findAllByOrderByBrandIdAsc();
}
