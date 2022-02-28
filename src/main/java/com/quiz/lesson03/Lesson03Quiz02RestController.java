package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.EstateBO;
import com.quiz.lesson03.model.Estate;

@RestController
public class Lesson03Quiz02RestController {

	@Autowired
	private EstateBO estateBO;
	
	// 요청 URL:  http://localhost/lesson03/quiz02/1
	@RequestMapping("/lesson03/quiz02/1")
	public String quiz02_1() {
		Estate estate = new Estate();
		estate.setRealtorId(3);
		estate.setAddress("푸르지용 리버 303동 1104호");
		estate.setArea(89);
		estate.setType("매매");
		estate.setPrice(100000);
		
		int rowCount = estateBO.addEstate(estate);
		return "입력성공:" + rowCount;
		
	}
	
//	// 요청 URL: http://localhost/lesson03/quiz02/2?realtor_id=5
//	@RequestMapping("/lesson03/quiz02/2")
//	public String quiz02_2(
//			@RequestParam("realtorId") int realtorId
//			) {
//		int row = estateBO.addEstate(5 ,"썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
//		return "입력성공 : " + row; 
//	}
}
