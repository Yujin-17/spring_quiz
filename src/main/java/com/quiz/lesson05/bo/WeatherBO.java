package com.quiz.lesson05.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson05.dao.WeatherDAO;
import com.quiz.lesson05.model.WeatherHistory;

@Service
public class WeatherBO {

	@Autowired
	public WeatherDAO weatherDAO;
	
	public List<WeatherHistory> getWeatherHistory(){
		List<WeatherHistory> weatherList = weatherDAO.selectWeatherHistory();
		return weatherList;
	}
	
}
