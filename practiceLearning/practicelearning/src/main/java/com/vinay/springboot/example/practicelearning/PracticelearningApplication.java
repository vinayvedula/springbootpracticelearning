package com.vinay.springboot.example.practicelearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class PracticelearningApplication {
	
	@RequestMapping("/backToWelcome")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping("/home")
	public ModelAndView home(@RequestParam(name="version", required = false, defaultValue = "0.1") String version) {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("version", version);
		return mav;
	}
	
	@RequestMapping("/greeting")
	public ModelAndView greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name) {
		ModelAndView mav = new ModelAndView("greeting");
		mav.addObject("name", name);
		return mav;
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticelearningApplication.class, args);
	}
}
