package com.quiz.lesson02.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.quiz.lesson02.model.Store;

@Repository		// 저장소에 가깝다. 
public interface StoreDAO {
	
	public List<Store> selectStoreList();
		
}
