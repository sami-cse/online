package com.sami.controller.website.global;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sami.repository.CategoryRepository;
import com.sami.repository.ProductRepository;

@ControllerAdvice
public class GlobalController {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ProductRepository productRepository;

	@ModelAttribute("categories")
	public void categories(Model model) {
		model.addAttribute("categories", categoryRepository.findAllByOrderByCategoryIdAsc());
	}

	@ModelAttribute("countProductViews")
	public void countProductViews(Model model) {
		model.addAttribute("countProductViews", productRepository.countProductViews());
	}

	@ModelAttribute("totalProducts")
	public void totalProducts(Model model) {
		model.addAttribute("totalProducts", productRepository.countProducts());
	}
}


