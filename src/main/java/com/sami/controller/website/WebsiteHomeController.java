package com.sami.controller.website;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sami.model.Category;
import com.sami.repository.CategoryRepository;

@Controller
public class WebsiteHomeController {

	@Autowired
	CategoryRepository categoryRepository;

	@RequestMapping(value = { "/", "/home" })
	public String home(Model model) {
		model.addAttribute("title", "Home");
		model.addAttribute("pages", "home");
		return "website/index";
	}

	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About Us");
		model.addAttribute("pages", "about");
		return "website/index";
	}

	@RequestMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("title", "Contact Us");
		model.addAttribute("pages", "contact");
		return "website/index";
	}

	@RequestMapping(value = { "/products" })
	public String showAllProducts(Model model, HttpServletRequest request) {
		model.addAttribute("title", "All Products");
		boolean productsUrl = request.getServletPath() != null;
		model.addAttribute("productUrl", productsUrl);
		model.addAttribute("pages", "products");
		return "website/index";
	}

	@RequestMapping(value = { "/category/{index}/products" })
	public String showCategoryProducts(@PathVariable("index") int index, Model model, HttpServletRequest request) {
		Category category = categoryRepository.findByCategoryId(index);
		model.addAttribute("title", category.getCategoryName());
		model.addAttribute("category", category);
		boolean categoryUrl = request.getServletPath() != null;
		model.addAttribute("categoryUrl", categoryUrl);
		model.addAttribute("pages", "products");
		return "website/index";
	}

}
