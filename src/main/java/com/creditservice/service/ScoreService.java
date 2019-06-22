package com.creditservice.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.creditservice.beans.CustomerRepo;
import com.creditservice.beans.CreditScore;

@Service
public class ScoreService 
{
	@Autowired
	private CustomerRepo customerRepo;
	
	public CreditScore getScoreBySsn(int ssn)
	{
		try
		{
			CreditScore cScore = customerRepo.findById(ssn).get();
			return cScore;
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
	}
}
