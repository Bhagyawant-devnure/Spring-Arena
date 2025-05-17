package com.deva.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.deva.sbeans.SeasonMessageGenerator;

public class DependencyInjectiontest {

	public static void main(String[] args) {
	System.out.println("DependencyInjectiontest.main()(start)");
	
	FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/deva/cfg/applicationContexttest.xml");

	
	Object obj=ctx.getBean("wmg");
	SeasonMessageGenerator generator=(SeasonMessageGenerator)obj;
	String msg=generator.showSeasonMessage("Deva");
	System.out.println(msg);
	ctx.close();
	System.out.println("DependencyInjectiontest.main()(end)");
	}

}
