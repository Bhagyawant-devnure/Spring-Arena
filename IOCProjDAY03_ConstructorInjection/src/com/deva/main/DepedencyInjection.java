package com.deva.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deva.beans.MapRender;

public class DepedencyInjection {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/deva/cfgs/applicationcontext.xml");
		 MapRender mapRender = ctx.getBean("mapRender", MapRender.class);

	        mapRender.render("Mumbai", "Pune", "Car");

	        ctx.close();

		
		

	}

}
