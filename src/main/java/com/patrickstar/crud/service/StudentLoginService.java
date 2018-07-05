package com.patrickstar.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrickstar.crud.bean.Student;
import com.patrickstar.crud.bean.StudentExample;
import com.patrickstar.crud.bean.StudentExample.Criteria;
import com.patrickstar.crud.dao.StudentMapper;



@Service
public class StudentLoginService {

	@Autowired
	StudentMapper studentMapper;

	
	public boolean dostudentLogin(String username, String password) {
		try {
			StudentExample example = new StudentExample();
			Criteria criteria = example.createCriteria();
			criteria.andStudentUsernameEqualTo(username);
			criteria.andStudentPasswordEqualTo(password);
			List<Student>list = studentMapper.selectByExample(example);
			
			if (list.get(0)!=null) {
				return true;
			}else {
				return false;
			}
			
		} catch (Exception e) {
			return false;
		}
	}
	
}
