package com.creditservice.beans;

import com.creditservice.beans.CreditScore;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<CreditScore, Integer>
{}
