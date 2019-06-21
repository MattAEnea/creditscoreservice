package com.creditservice.beans;

import com.creditservice.beans.CreditScore;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<CreditScore, Integer>
{
	
}
