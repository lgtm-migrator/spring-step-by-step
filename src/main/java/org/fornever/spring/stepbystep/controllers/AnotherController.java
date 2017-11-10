package org.fornever.spring.stepbystep.controllers;

import java.util.HashMap;

import org.fornever.spring.stepbystep.util.JustAUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/api/v1")
public class AnotherController {

	@GetMapping("/anotherpath")
	public Object astring() {
		return "return a string";
	}

	@GetMapping("/iwantjson")
	public Object iwantjson() {
		// return a hashmap
		return new HashMap<String, String>() {
			{
				put("hello", "json");
			}
		};
	}

	@Autowired
	JustAUtil util;

	@GetMapping("/add")
	public Object add(Integer a, Integer b) {
		return util.add(a, b);
	}

}
