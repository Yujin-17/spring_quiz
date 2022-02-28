package com.quiz.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson03.model.Estate;

@Repository
public interface EstateDAO {

	public Estate selectEstate(int id);
	
	public List<Estate> selectEstatePrice(int rentPrice);		// 하나일때는 굳이 map으로 만들지 않아도 된다. 
	
	public List<Estate> selectEstateListByAreaPrice(
			@Param("area") int area, 
			@Param("price") int price);		// @Param은 파라미터들을 map으로 구성해준다.  >> DAO에서만 사용 
	
	public int insertEstate(Estate estate);
	
//	public int insertEstate(
//			@Param("realtorId") int realtorId,
//			@Param("address") String address, 
//			@Param("area") int area, 
//			@Param("type") String type, 
//			@Param("price") int price, 
//			@Param("rentPrice") Integer rentPrice);
}
