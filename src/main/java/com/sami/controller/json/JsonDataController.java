package com.sami.controller.json;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sami.model.Product;
import com.sami.repository.ProductRepository;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	ProductRepository productRepository;

	@RequestMapping("/products")
	@ResponseBody
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@RequestMapping("/category/{categoryId}/products")
	@ResponseBody
	public List<Product> findAllProductByCategoryId(@PathVariable int categoryId) {
		return productRepository.getProductsByCategoryId(categoryId);
	}
}
