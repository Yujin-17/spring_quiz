package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController
public class Lesson01Quiz02RestController {

	// 요청 URL : http://localhost:8080/lesson01/quiz02/1
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1(){
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>(); // 메모리 구조 : stack과 heap      stack - 변수같은게 들어감, 쌓이는 형태  heap -  
		map.put("rate", 15);							// map도 stack에 들어감,  new를 하게되면 heap에 쌓임 ex) 이름: 봉준호
		map.put("director", "봉준호");					// Map<String, Object> map => stack   / new HashMap<>() => heap 
		map.put("time", 131);
		map.put("title", "기생충");
		list.add(map);
		
		map = new HashMap<>();							// 그래서 이런 형태가 가능 
		map.put("rate", 0);
		map.put("director", "르베르토 베니니");
		map.put("time", 116);
		map.put("title", "인생은 아름다워");
		list.add(map);
		
	    map = new HashMap<>();
		map.put("rate", 12);
		map.put("director", "크리스토퍼 놀란");
		map.put("time", 147);
		map.put("title", "인셉션");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate", 19);
		map.put("director", "윤종빈");
		map.put("time", 133);
		map.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate", 15);
		map.put("director", "프란시스 로렌스");
		map.put("time", 137);
		map.put("title", "헝거게임");
		list.add(map);
	
		
		return list;
	}
	
	// 요청 URL : http://localhost:8080/lesson01/quiz02/2
	@RequestMapping("/2")
	public List<NoticeBoard> quiz02_2(){
		
		List<NoticeBoard> list = new ArrayList<>();
		
		NoticeBoard board = new NoticeBoard();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		list.add(board);
		
		board = new NoticeBoard();
		board.setTitle("헐 대박");
		board.setUser("bada");
		board.setContent("오늘 목요일이 었어... 금요일인줄");
		list.add(board);
		
		board = new NoticeBoard();
		board.setTitle("오늘 데이트 한 이야기 해드릴게요.");
		board.setUser("dulumary");
		board.setContent("....");
		list.add(board);
	
		return list;
	}
	
	// 요청 URL : http://localhost:8080/lesson01/quiz02/3
	@RequestMapping("/3")
	public ResponseEntity<NoticeBoard> quiz02_3() {			// <> 사이에 넣는 값은 내가 내리고 싶은 데이터 객체 
		NoticeBoard board = new NoticeBoard();
		board.setTitle("안녕하세요 가입인사 드립니다.");
		board.setUser("hagulu");
		board.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		
		return new ResponseEntity<>(board, HttpStatus.INTERNAL_SERVER_ERROR); 
	}
}
