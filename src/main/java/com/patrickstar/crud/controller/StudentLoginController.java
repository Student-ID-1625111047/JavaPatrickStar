package com.patrickstar.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.patrickstar.crud.service.StudentLoginService;


@Controller
public class StudentLoginController {
	
	@Autowired
	StudentLoginService studentLoginService;
	
	@RequestMapping("/dostudentLogin")
	public String doLogin(@RequestParam String username, @RequestParam String password){
		
		
			if (studentLoginService.dostudentLogin(username, password)) {
				return "studentHome";
			}else {
				return "student";
			}
		
	}
	
	@RequestMapping("/studentLogout")
	public String studentLogout() {
		return "student";
	}
}
