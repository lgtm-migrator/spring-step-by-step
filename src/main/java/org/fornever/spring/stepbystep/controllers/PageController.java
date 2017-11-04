package org.fornever.spring.stepbystep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Dont use RestController

@Controller
public class PageController {

	@RequestMapping("/renderpage")
	public Object renderPage(@RequestParam(name = "name", defaultValue = "spring") String name, Model model) {
		// set model, model data will be passed to template engine
		model.addAttribute("name", name);
		// use "render.html" as template
		return "render";
	}

}
