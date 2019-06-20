package com.creditservice.beans;

import javax.persistence.Entity;

@Entity
public class CreditScore 
{
	private int ssn;
	private int creditScore;
	private String name;
	
	protected CreditScore() {}
	
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
