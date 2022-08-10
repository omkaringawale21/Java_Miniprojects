package org.omkaringawale.flowproject;

import java.util.Scanner;

import org.omkaringawale.flowproject.controller.SumController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoFlowProject {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		MyModel myModel = new MyModel();
		myModel.setFno(a);
		myModel.setSno(b);
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		SumController sc = (SumController)beanFactory.getBean("idSumController");
		sc.doMathCal(myModel);

		System.out.println("Sum = " + myModel.getSum());
		System.out.println("Sub = " + myModel.getSub());
		
	}

}
