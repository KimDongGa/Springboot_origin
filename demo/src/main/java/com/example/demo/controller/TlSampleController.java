package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.TlSampleDAO;
import com.example.demo.entity.UserData;

@Controller
public class TlSampleController {

	@Autowired
	public TlSampleDAO dao;

	@GetMapping(value="/hello")
	public String hello(Model model) throws Exception {
//		String name = "ThymeLeaf";

		List<UserData> name = dao.selectTest();
		List<UserData> cmnt = dao.selectTest1();

		model.addAttribute("hello","Hello ThymeLeaf Template");
		model.addAttribute("cmnt",cmnt);
		model.addAttribute("name", name);
		return "hello";
	}


	public String test(Model model) {
		return "/leaf";
	}

}
