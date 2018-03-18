package com.sami.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sami.model.*;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	List<Category> findAllByOrderByCategoryIdAsc();

	Category findByCategoryId(int index);
}
