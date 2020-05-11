package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	@Autowired
	CustomerRepo repo;
	@RequestMapping("/poorna")
	public String poorna() {
		return "poorna";
	}
	@RequestMapping("/details")
	public String details(Customer customer) {
		repo.save(customer);
		return "poorna";
	}
	@RequestMapping("/getdetails")
	public String getdetails() {
		return "Viewpoorna";
	}
	@PostMapping("/getdetails")
	public ModelAndView poornaDetails(@RequestParam int cid)
	{
		ModelAndView mv=new ModelAndView("Retrive");
		Customer customer=repo.findById(cid).orElse(null);
		mv.addObject(customer);
		return mv;
	}
}
