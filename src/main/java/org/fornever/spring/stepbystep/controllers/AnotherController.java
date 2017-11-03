package org.fornever.spring.stepbystep.controllers;

import java.util.HashMap;

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
		return new HashMap<String, String>() {
			{
				put("hello", "json");
			}
		};
	}

}
