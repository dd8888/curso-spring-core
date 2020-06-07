package com.openwebinars.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		Saludator saludador = null;
		
		//saludador = (Saludator) appContext.getBean("saludator");
		
		//saludador = appContext.getBean("saludator", Saludator.class);
		
		saludador = appContext.getBean(Saludator.class);
		
		System.out.print(saludador.saludo());
		
		((ClassPathXmlApplicationContext) appContext).close();	
	}

}
