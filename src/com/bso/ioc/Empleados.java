package com.bso.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.context.xml");
		
		IEmpleado director = ctx.getBean("Director", IEmpleado.class);
		IEmpleado secretario = ctx.getBean("Secretario", IEmpleado.class);
		
		System.out.println(director.getTareas());
		System.out.println(secretario.getTareas());
		System.out.println(director.getInforme());
		ctx.close();

	}

}
