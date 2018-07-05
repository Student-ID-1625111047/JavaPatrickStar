package com.patrickstar.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrickstar.crud.bean.House;
import com.patrickstar.crud.dao.HouseMapper;

@Service
public class HouseService {
	
	@Autowired
	HouseMapper houseMapper;
	
	public List<House> getAll() {
		// TODO Auto-generated method stub
		return houseMapper.selectByExampleWithLandlord(null);
		
	}
	
}
