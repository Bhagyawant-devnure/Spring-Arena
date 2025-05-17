package com.deva.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.deva.beans.Person;

public class DepedencyInjection {

	public static void main(String[] args) {
		System.out.println("DepedencyInjection.main()(start)");
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext ("src/com/deva/cfgs/applicationContext.xml");
		Object obj =ctx.getBean("person");
		Person person =(Person)obj;
		person.displayInfo();
		ctx.close();
		System.out.println("DepedencyInjection.main()(end)");

	}

}
