package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class TlSampleController {

	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("hello","서버에서 보내준 값");
		return "/index";
	}


//	@GetMapping("/")
	public String test(Model model) {
//		model.addAttribute("hello","서버에서 보내준 값");
		return "/leaf";
	}

}
