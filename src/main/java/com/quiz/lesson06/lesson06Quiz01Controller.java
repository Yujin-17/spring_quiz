package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quiz.lesson06.bo.FavoriteBO;
import com.quiz.lesson06.model.Favorites;

@Controller
@RequestMapping("/lesson06/quiz01")
public class lesson06Quiz01Controller {

	@Autowired
	private FavoriteBO favoriteBO;
	
	// 즐겨찾기 추가하는 화면 
	@RequestMapping("/insertView")
	public String quiz01insertView() {
		return "lesson06/favoriteView";
	}
	
	// 즐겨찾기 추가 수행 - AJAX가 요청하는 API
	@ResponseBody		// 응답값이 데이터 String으로 내려간다. 
	@PostMapping("/add_favorite")
	public Map<String, String> addAddress(		// Map으로 리턴 시 json으로 내려감. json은 키와 값이 ""로 감싸져야함. // String으로 묶여있는 JSON 리턴. 
			@RequestParam("name") String name,
			@RequestParam("url") String url) {
		
		// TODO insert db
		favoriteBO.addAddress(name, url);
	
		// 응답값 구성 (map -> json string)
		Map<String, String> result = new HashMap<>();
		result.put("result", "success");
		
		// return 응답값 
		return result;
	}
	
	// 즐겨찾기 목록 화면 
	@RequestMapping("/favoriteList")
	public String favoriteList(Model model) {
		// db select 
		List<Favorites> favoriteList = favoriteBO.getFavoriteList();
		
		// model 에 담는다. 
		model.addAttribute("favoriteList", favoriteList);
		
		return "lesson06/favoriteList";
	}
}
