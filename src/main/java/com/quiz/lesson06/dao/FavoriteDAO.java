package com.quiz.lesson06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson06.model.Favorites;

@Repository
public interface FavoriteDAO {

	public void insertFavorite(
		@Param("name") String name,			// Param 어노테이션 붙이면 Map이 된다. 
		@Param("url") String url);
	
	public Favorites selectFavorite();	
	
	public List<Favorites> selectFavoriteList();
}
