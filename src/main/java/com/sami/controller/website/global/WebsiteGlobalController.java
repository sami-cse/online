package com.sami.controller.website.global;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sami.repository.CategoryRepository;
import com.sami.repository.ProductRepository;

@ControllerAdvice
public class WebsiteGlobalController {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ProductRepository productRepository;

	@ModelAttribute("categories")
	public void categories(Model model) {
		model.addAttribute("categories", categoryRepository.findAllByOrderByCategoryIdAsc());
	}

}


