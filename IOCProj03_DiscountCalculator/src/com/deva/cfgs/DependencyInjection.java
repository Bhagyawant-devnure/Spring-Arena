package com.deva.cfgs;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.deva.main.Discountcalculator;

public class DependencyInjection {

	public static void main(String[] args) {
		System.out.println("DependencyInjection.main()(Start)");
		FileSystemXmlApplicationContext ctx =new FileSystemXmlApplicationContext("src/com/deva/beans/applicationContext.xml");

		Object obj =ctx.getBean("discal");
		
		Discountcalculator calculator =(Discountcalculator)obj;
		
		double msg =calculator.calculateDiscount();
		System.out.println(msg);
		ctx.close();
		System.out.println("DependencyInjectionTest.main()(end)");
	}

}
