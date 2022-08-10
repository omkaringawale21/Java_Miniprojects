package org.omkaringawale.jdbctemplateproject;

import org.springframework.jdbc.core.JdbcTemplate;

public class TrainMasterDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	int insertTrainMater(TrainMaster tm){
		String query = "insert into trainmaster values(" + tm.getTrainno() + ", '" + tm.getTrainname() + "', '" + tm.getFromplace() + "', '" + tm.getToplace() + "', '" + tm.getTraintype() + "')";
		
		return jdbcTemplate.update(query);
	}
	
}
