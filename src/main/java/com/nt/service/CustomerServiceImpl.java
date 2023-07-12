package com.nt.service;

import com.nt.Dao.ICustomerDao;
import com.nt.bo.CustomerBo;
import com.nt.dto.CustomerDto;

public class CustomerServiceImpl implements ICustomerService {
	private ICustomerDao dao;

	public CustomerServiceImpl(ICustomerDao dao) {
		super();
		System.out.println("this is 1 param constructer");
		this.dao = dao;
	}

	public String CalculateSimpleInterest(CustomerDto dto) throws Exception {
	float	simpsimpleInterest= (dto.getPamt() * dto.getTime() * dto.getRate()) / 100.0f;
		CustomerBo bo = new CustomerBo();
		dto.setId(bo.getId());
		dto.setName(bo.getName());
		dto.setAddres(bo.getAddres());
		dto.setPamt(bo.getPamt());
		dto.setRate(bo.getRate());
		dto.setTime(bo.getTime());
       int count=dao.insert(bo);
		return count==1?"customerregistoresussefully"+""+simpsimpleInterest:"registration fails";
	}

}
