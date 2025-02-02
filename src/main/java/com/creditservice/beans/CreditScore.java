package com.creditservice.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditScore 
{
	@Id
	private int ssn;
	private int creditScore;
	private String name;
	
	public CreditScore() {}
	
	public int getSsn() 
	{
		return ssn;
	}
	
	public void setSsn(int ssn) 
	{
		this.ssn = ssn;
	}
	
	public int getCreditScore() 
	{
		return creditScore;
	}
	
	public void setCreditScore(int creditScore) 
	{
		this.creditScore = creditScore;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
