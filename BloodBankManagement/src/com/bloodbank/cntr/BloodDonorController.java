package com.bloodbank.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bloodbank.dto.BloodDonor;
import com.bloodbank.dto.User;
import com.bloodbank.service.BloodDonorService;

@Controller
public class BloodDonorController {
	
	@Autowired
	private BloodDonorService bloodDonorService;
	
	@RequestMapping(value = "/request_blood_form.htm",method = RequestMethod.GET)
	public String requestBloodForm(ModelMap map) {
		map.put("bloodDonor", new BloodDonor());
		return "blood_req_form";
	}
	
	@RequestMapping(value = "/request_add.htm", method = RequestMethod.POST)
	public String requestBloodAdd(BloodDonor bloodDonor, HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		bloodDonor.setUserId(userId);
		bloodDonorService.addBlood(bloodDonor);
		return "home";
	}
	
	@RequestMapping(value = "/blood_request_list.htm", method = RequestMethod.GET)
	public String allRequestList(ModelMap map, HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<BloodDonor> li = bloodDonorService.selectAll(userId);
		map.put("reqList", li);
		return "blood_request_list";
	}
	
	@RequestMapping(value = "/request_delete.htm",method = RequestMethod.GET)
	public String requestDelete(@RequestParam int donarId, ModelMap map, HttpSession session) {
		bloodDonorService.removeDonar(donarId);
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<BloodDonor> li = bloodDonorService.selectAll(userId);
		map.put("reqList", li);
		return "blood_request_list";
	}
	
	@RequestMapping(value = "/request_update_form.htm",method = RequestMethod.GET)
	public String requestUpdateForm(@RequestParam int donarId, ModelMap map) {
		BloodDonor bdr = bloodDonorService.findDonar(donarId);
		map.put("reqList", bdr);
		return "request_update_form";
	}
	
	@RequestMapping(value = "/request_update.htm", method = RequestMethod.POST)
	public String requestUpdate(BloodDonor bloodDonor,ModelMap map, HttpSession session) {
	
		int userId = ((User)session.getAttribute("user")).getUserId();
		bloodDonor.setUserId(userId);
		bloodDonorService.modifyDonar(bloodDonor);
		List<BloodDonor> li = bloodDonorService.selectAll(userId);
		map.put("reqList", li);
		
		return "blood_request_list";
	}
	
}
