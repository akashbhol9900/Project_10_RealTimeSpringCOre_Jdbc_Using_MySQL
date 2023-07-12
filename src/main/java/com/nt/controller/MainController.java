package com.nt.controller;

import com.nt.Vo.CustomerVo;
import com.nt.dto.CustomerDto;
import com.nt.service.ICustomerService;

public class MainController {
private ICustomerService service;

public MainController(ICustomerService service)
{
	super();
	System.err.println("this is 1 param constructor");
	this.service=service;
			
}
public String processController(CustomerVo vo) throws Exception
{
	CustomerDto dto=new CustomerDto();
	dto.setId(Integer.parseInt(vo.getId()));
	dto.setName(vo.getName());
	dto.setAddres(vo.getAddres());
	dto.setPamt(Float.parseFloat(vo.getPamt()));
	dto.setRate(Float.parseFloat(vo.getRate()));
	dto.setTime(Float.parseFloat(vo.getTime()));
	String result=service.CalculateSimpleInterest(dto);
	return result;
}
}
