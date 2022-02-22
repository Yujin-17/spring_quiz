package com.quiz.lesson03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.EstateBO;
import com.quiz.lesson03.model.Estate;

@RequestMapping("/lesson03/quiz01")	// 주소 생략 법 
@RestController
public class Lesson03Quiz01RestController {

	@Autowired
	private EstateBO estateBO;
	
	
	// 요청 URL: http://localhost/lesson03/quiz01/1?id=20
	@RequestMapping("/1")
	public Estate quiz01_1(
			@RequestParam(value="id") int id			// id를 필수 파라미터로 받을수 있게 함 
	) {
		return estateBO.getEstateById(id);
	}
	
	// 요청 URL: http://localhost/lesson03/quiz01/2?rentPrice=90
	@RequestMapping("/2")
	public List<Estate> quiz01_2(		// 여러값이 내려가기 때문에 List로 만들어 준다. 파라미터 월세 미만 전부 출력
			@RequestParam("rentPrice") int rentPrice
	) {
		return estateBO.getEstateByPrice(rentPrice);
		
	}
	
	// 요청 URL: http://localhost/lesson03/quiz01/3?area=90&price=130000
		@RequestMapping("/3")
	public List<Estate> quiz01_3(	
			@RequestParam("area") int area,
			@RequestParam("price") int price
	) {
		return estateBO.getEstateListByAreaPrice(area, price);
		
	}
}
