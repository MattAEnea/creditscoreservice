package com.creditservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;  

import com.creditservice.beans.*;

@Controller
@RequestMapping(path="/ssn")
public class CreditScoreController 
{
	@Autowired
	private CustomerRepo customerRepo;
	
	@PostMapping(path="/creditscore")
	public @ResponseBody String addNewScore(
			@RequestParam String name, @RequestParam int ssn,
			@RequestParam int creditScore)
	{
		CreditScore cScore = new CreditScore();
		cScore.setName(name);
		cScore.setSsn(ssn);
		cScore.setCreditScore(creditScore);
		customerRepo.save(cScore);
		return "Saved";
	}
	
	@RequestMapping(value="/display", method = RequestMethod.POST)
	public @ResponseBody Optional<CreditScore> getBySsn(int ssn)
	{
		return customerRepo.findById(ssn);
	}
	
	
}
