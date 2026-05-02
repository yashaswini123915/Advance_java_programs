package com.javatpoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) {

try(

ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml")

)

{

EmployeeDao dao= (EmployeeDao)ctx.getBean("edao");

dao.saveEmployeeByPreparedStatement(new Employee(1,"Rajesh",5000)

);

}

}

}

