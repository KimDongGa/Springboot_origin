package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TlSampleController {

	@GetMapping(value="/hello")
	public String hello(Model model) {
		String name = "ThymeLeaf";

		model.addAttribute("hello","Hello ThymeLeaf Template");
		model.addAttribute("name", name);
		return "hello";
	}


	public String test(Model model) {
		return "/leaf";
	}

}
