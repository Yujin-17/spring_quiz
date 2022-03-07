package com.quiz.lesson05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson05.bo.WeatherBO;
import com.quiz.lesson05.model.WeatherHistory;

@RestController
public class Lesson05Quiz05RestController {
	
	@Autowired
	public WeatherBO weatherBO;
	
	@RequestMapping("/lesson05/quiz05")
	public List<WeatherHistory> quiz05() {
		List<WeatherHistory> weatherList = weatherBO.getWeatherHistory();
		return weatherList;
	}
	

	
}
