package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TlSampleController {

	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("myName", "ThymeLeaf");
		return "index";
	}


	public String test(Model model) {
		return "/leaf";
	}

}
