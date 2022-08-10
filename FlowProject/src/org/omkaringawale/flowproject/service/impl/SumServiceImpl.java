package org.omkaringawale.flowproject.service.impl;

import org.omkaringawale.flowproject.dao.SumDao;
import org.omkaringawale.flowproject.dto.SumDto;
import org.omkaringawale.flowproject.model.SumForm;
import org.omkaringawale.flowproject.service.SumService;

public class SumServiceImpl implements SumService {	
	
	private SumDao sumDao;

	public void setSumDao(SumDao sumDao) {
		this.sumDao = sumDao;
	}

	@Override
	public void calculate(SumDto sumDto) {
		
		int fno = sumDto.getFno();
		int sno = sumDto.getSno();
		int sum = fno + sno;
		int sub = fno - sno;
		
		sumDto.setSum(sum);
		sumDto.setSub(sub);
		
		SumForm sumForm = new SumForm();
		sumForm.setFno(sumDto.getFno());
		sumForm.setSno(sumDto.getSno());
		sumForm.setSum(sumDto.getSum());
		sumForm.setSub(sumDto.getSub());
		
		sumDao.insertNumbers(sumForm);
		
	}
	
}
