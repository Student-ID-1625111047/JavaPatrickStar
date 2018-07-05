package com.patrickstar.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.patrickstar.crud.service.LandlordLoginService;


@Controller
public class LandlordLoginController {
	
	
	
	@Autowired
	LandlordLoginService landlordLoginService;
	
	@RequestMapping("/doLandlordLogin")
	public String doLogin(@RequestParam String username, @RequestParam String password,Model model){
		
		Integer code[] = {0};
			
			if (landlordLoginService.doLandlordLogin(username, password,code)) {
				model.addAttribute("userid", code[0]);
				System.out.println("第二部"+code[0]);
				return "landlordHome";
			}else {
				return "landlord";
			}
		
	}
	
	@RequestMapping("/landlordLogout")
	public String landlordLogout() {
		return "landlord";
	}
}
