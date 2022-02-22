package com.quiz.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson02.dao.StoreDAO;
import com.quiz.lesson02.model.Store;

@Service		// 어노테이션 안붙이면 에러  스프링 빈
public class StoreBO {

	@Autowired
	private StoreDAO storeDAO;
	
	public List<Store> getStoreList(){ // BO같은 경우 get으로 시작하는 경우 많다. 뭔가를 얻기 때문에 
		List<Store> storeList = storeDAO.selectStoreList();
		return storeList;
		
	}
}
