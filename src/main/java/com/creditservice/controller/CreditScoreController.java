package com.creditservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.creditservice.beans.*;
import com.creditservice.service.ScoreService;

@Controller
public class CreditScoreController 
{
	@Autowired
	private ScoreService scoreService;
	
	@GetMapping("/")
	public String showHome()
	{
		return "form";
	}
	
	@PostMapping("/score")
	public String findScore(
			@RequestParam int ssn, Model model)
	{
		CreditScore cScore = scoreService.getScoreBySsn(ssn);
		if(cScore == null)
		{
			return "redirect:/err";
		}
		model.addAttribute("score", cScore);
		return "viewscore";
	}
	
	@GetMapping("/err")
	public String error(Model model)
	{
		model.addAttribute("message", "SSN not found in database.");
		return "error";
	}
	
}
