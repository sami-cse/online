package com.sami.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sami.model.Product;
import com.sami.repository.BrandRepository;
import com.sami.repository.CategoryRepository;

@Controller
public class AdminController {

	@Autowired
	BrandRepository brandRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@RequestMapping(value = { "/admin"})
	public String admin(Model model) {
		model.addAttribute("title", "Admin");
		model.addAttribute("pages", "admin");
		return "admin/index";
	}

	@RequestMapping(value = { "/admin/addProduct" }, method = RequestMethod.GET)
	public String addProductGET(Model model) {
		model.addAttribute("pages", "addProduct");
		Product product = new Product();
		model.addAttribute("product", product);
		model.addAttribute("brandList", brandRepository.findAllByOrderByBrandIdAsc());
		model.addAttribute("categoryList", categoryRepository.findAllByOrderByCategoryIdAsc());
		model.addAttribute("action", "/admin/addProduct");
		return "admin/index";
	}

	@RequestMapping(value = { "/admin/addProduct" }, method = RequestMethod.POST)
	public String addProductPOST(Model model, @ModelAttribute("product") Product product) {
		model.addAttribute("product", product);
		model.addAttribute("brandList", brandRepository.findAllByOrderByBrandIdAsc());
		model.addAttribute("categoryList", categoryRepository.findAllByOrderByCategoryIdAsc());
		model.addAttribute("action", "/admin/addProduct");
		return "redirect:/admin";
	}

	@RequestMapping(value = { "/admin/totalServey" })
	public String totalServey(Model model) {
		model.addAttribute("pages", "totalServey");
		return "admin/index";
	}
}
