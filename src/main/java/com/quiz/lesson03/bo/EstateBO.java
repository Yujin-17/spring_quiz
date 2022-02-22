package com.quiz.lesson03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.dao.EstateDAO;
import com.quiz.lesson03.model.Estate;

@Service
public class EstateBO {

	@Autowired
	private EstateDAO estateDAO;
	
	public Estate getEstateById(int id) {
		return estateDAO.selectEstate(id);
	}
	
	public List<Estate> getEstateByPrice(int rentPrice) {
		return estateDAO.selectEstatePrice(rentPrice);
	}
	
	public List<Estate> getEstateListByAreaPrice(int area, int price) {
		return estateDAO.selectEstateListByAreaPrice(area, price);
	}
	
	public int addEstate(Estate estate) {
		return estateDAO.insertEstate(estate);
	}
	
	public int addEstate(int realtorId, String address, int area, String type, int price, Integer rentPrice) {
		return estateDAO.insertEstate(realtorId, address, area, type, price, rentPrice);
	}
}
