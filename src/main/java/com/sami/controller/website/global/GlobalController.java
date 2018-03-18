package com.sami.controller.website.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.sami.repository.CategoryRepository;

@ControllerAdvice
public class GlobalController {

	@Autowired
	CategoryRepository categoryRepository;

	@ModelAttribute("categories")
	public void categories(Model model) {
		model.addAttribute("categories", categoryRepository.findAllByOrderByCategoryIdAsc());
	}
}
