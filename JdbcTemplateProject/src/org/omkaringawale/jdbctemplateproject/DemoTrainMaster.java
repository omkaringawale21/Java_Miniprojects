package org.omkaringawale.jdbctemplateproject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTrainMaster {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		TrainMaster tmi = new TrainMaster();
		tmi.setTrainno(3);
		tmi.setTrainname("SINHGAD EXPRESS");
		tmi.setFromplace("PUNE");
		tmi.setToplace("MUMBAI");
		tmi.setTraintype("E");
		
		TrainMasterDao trainMasterDao = (TrainMasterDao)beanFactory.getBean("idTrainMasterDao");
		trainMasterDao.insertTrainMater(tmi);
		
		System.out.println("Record Inserted Successfully!");

	}

}
