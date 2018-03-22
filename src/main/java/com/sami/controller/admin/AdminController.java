package com.sami.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping(value = { "/admin", "/welcome" })
	public String home(Model model) {
		model.addAttribute("title", "Admin");
		model.addAttribute("pages", "admin");
		return "admin/index";
	}
}
