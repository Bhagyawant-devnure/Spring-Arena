package com.deva.main;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.deva.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()(start)");
		
		//create IOC container
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/deva/cfgs/applicationContext.xml");

		Object obj=ctx.getBean("wmg");
		
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		
		String msg =generator.showWishMessage(" Deva ");
		System.out.println(msg);
		ctx.close();
		System.out.println("DependencyInjectionTest.main()(end)");
	}

}
