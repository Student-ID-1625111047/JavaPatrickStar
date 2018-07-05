package com.patrickstar.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.patrickstar.crud.bean.Landlord;
import com.patrickstar.crud.bean.LandlordExample;
import com.patrickstar.crud.bean.Student;
import com.patrickstar.crud.bean.LandlordExample.Criteria;
import com.patrickstar.crud.dao.LandlordMapper;
import com.patrickstar.crud.dao.StudentMapper;


@Service
public class LandlordLoginService {

	@Autowired
	LandlordMapper landlordMapper;

	
	public boolean doLandlordLogin(String username, String password,Integer[] code) {
		try {
			LandlordExample example = new LandlordExample();
			Criteria criteria = example.createCriteria();
			criteria.andLandlordUsernameEqualTo(username);
			criteria.andLandlordPasswordEqualTo(password);
			List<Landlord>list = landlordMapper.selectByExample(example);
			
			
			if (list.get(0)!=null) {
				code[0]=list.get(0).getLandlordId();
				System.out.println("第一步"+code[0]);
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
	}
	
}
