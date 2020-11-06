package com.bloodbank.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bloodbank.dto.AdminUser;
import com.bloodbank.service.AdminService;



@Controller
public class AdminController {
	

	@Autowired
	private AdminService adminService;
//	
//	@RequestMapping(value = "/prep_reg_form1.htm" ,method =RequestMethod.GET)
//	public String prepRegForm1(ModelMap map) {
//		map.put("adminUser", new AdminUser());
//		return "reg_form2";
//		
//	}
//	@RequestMapping(value = "/reg2.htm",method = RequestMethod.POST)
//	public String register(AdminUser adminUser , BindingResult result, ModelMap map ) {
//		adminService.addUser(adminUser);
//			return "index";
//		
//	}
	@RequestMapping(value = "/prep_log_form1.htm",method = RequestMethod.GET)
	public String prepLogin1(ModelMap map) {
		map.put("adminUser", new AdminUser());
		return "login_form2";
		
	}
	@RequestMapping(value = "/admhome.htm",method = RequestMethod.POST)
	public String login(AdminUser adminUser,BindingResult result, ModelMap map, HttpSession session) {
		boolean b = adminService.findUser(adminUser);
		if(b) {
			return "admhome";
		}
		else {
			map.put("user",new AdminUser());
			return "login_form2";
		}
		
		
	}
	
}
