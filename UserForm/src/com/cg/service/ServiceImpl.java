package com.cg.service;

import java.util.regex.Pattern;

public class ServiceImpl implements IServiceImpl {

	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateName(String n) 
	{
		if(n!=null)
			return true;
		else
			return false;
	}

	@Override
	public boolean validateAge(int a) 
	{
		if(a>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean validateContact(long pnum)
	{
		/*Long input = new Long(pnum);
		String inpStr =input.toString();
		String pattern ="[9-7]{1}[0-9]{9}";
		if(Pattern.matches(pattern,inpStr))*/
			 return true;
		/*else
			return false;*/
	}

}
