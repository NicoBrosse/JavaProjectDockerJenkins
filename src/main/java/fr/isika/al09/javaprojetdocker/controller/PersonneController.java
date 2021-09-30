package fr.isika.al09.javaprojetdocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonneController {
	
	
	@RequestMapping(value="/bonjour", method = RequestMethod.GET)
	public ModelAndView direBonjour() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("bonjour");
		return modelAndView;
	}
	
	@RequestMapping(value="/bonjour", method = RequestMethod.POST)
	public ModelAndView direBonjour(String nom) {
		String message;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("bonjour");
		message = "Bonjour " + nom + " Vous êtes bien matinal"; 
		modelAndView.addObject("message",message);
		return modelAndView;
	}
	
	
	
}
