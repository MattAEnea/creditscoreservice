package com.creditservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;  

import com.creditservice.beans.*;

@RestController
@RequestMapping(path="/ssn")
public class CreditScoreController 
{
	@Autowired
	private CustomerRepo customerRepo;
	
	@PostMapping(path="/creditscore")
	public String findScore(
			@RequestParam int ssn, ModelAndView mandv)
	{
		CreditScore cScore = customerRepo.findById(ssn).get();
		mandv.addObject("score", cScore);
		return "find-score";
	}
	
}
