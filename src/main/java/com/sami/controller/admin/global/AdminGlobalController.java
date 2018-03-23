package com.sami.controller.admin.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sami.repository.ProductRepository;

@ControllerAdvice
public class AdminGlobalController {

	@Autowired
	ProductRepository productRepository;

	@ModelAttribute("countProductViews")
	public void countProductViews(Model model) {
		model.addAttribute("countProductViews", productRepository.countProductViews());
	}

	@ModelAttribute("totalProducts")
	public void totalProducts(Model model) {
		model.addAttribute("totalProducts", productRepository.countProducts());
	}
}

