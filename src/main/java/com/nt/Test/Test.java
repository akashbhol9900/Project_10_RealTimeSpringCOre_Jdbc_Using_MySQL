package com.nt.Test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Vo.CustomerVo;
import com.nt.controller.MainController;

public class Test {

	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	String id=sc.nextLine();
	System.out.println("Enter the name");
	String name=sc.nextLine();
	System.out.println("Enter the addres");
	String addres=sc.nextLine();
	System.out.println("enter the pamt");
	String pamt=sc.nextLine();
	System.out.println("enter the rate");
	String rate=sc.nextLine();
	System.out.println("Enter the time");
	String time=sc.nextLine();
	
	CustomerVo vo=new CustomerVo();
	vo.setId(id);
	vo.setName(name);
	vo.setAddres(addres);
	vo.setPamt(pamt);
	vo.setRate(rate);
	vo.setTime(time);
	
AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/nt/config/ApplicationContext.xml");
	System.out.println("i love code");
	MainController controller=(MainController) context.getBean("controller");
	System.out.println("i will marry to code");
	try {
	String result  =controller.processController(vo);
	System.out.println(result);
System.out.println("i am akash bhol");
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		throw e;
	}

}
}
