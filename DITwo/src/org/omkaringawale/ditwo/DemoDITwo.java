package org.omkaringawale.ditwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoDITwo {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Address add = (Address)applicationContext.getBean("idAdd");
		add.displayAddress();

	}

}
