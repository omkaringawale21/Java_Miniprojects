package org.omkaringawale.flowproject.controller;

import org.omkaringawale.flowproject.MyModel;
import org.omkaringawale.flowproject.dto.SumDto;
import org.omkaringawale.flowproject.service.SumService;

public class SumController {

	private SumService service;

	public SumService getService() {
		return service;
	}

	public void setService(SumService service) {
		this.service = service;
	}
	
	public void doMathCal(MyModel myModel){
		
		SumDto sumDto = new SumDto();
		sumDto.setFno(myModel.getFno());
		sumDto.setSno(myModel.getSno());
		
		service.calculate(sumDto);
		
		myModel.setSum(sumDto.getSum());
		myModel.setSub(sumDto.getSub());
		
	}
	
}
