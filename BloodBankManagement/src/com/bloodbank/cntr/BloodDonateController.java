package com.bloodbank.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bloodbank.dto.BloodDonate;
import com.bloodbank.dto.BloodDonor;
import com.bloodbank.dto.User;
import com.bloodbank.service.BloodDonateService;

@Controller
public class BloodDonateController {
	
	@Autowired
	private BloodDonateService bloodDonateService;
	
	@RequestMapping(value = "/donate_blood_form.htm",method = RequestMethod.GET)
	public String donateBloodForm(ModelMap map) {
		map.put("bloodDonate", new BloodDonate());
		return "blood_donate_form";
	}
	
	@RequestMapping(value = "/donate_add.htm", method = RequestMethod.POST)
	public String donateBloodAdd(BloodDonate bloodDonate,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		bloodDonate.setUserId(userId);
		bloodDonateService.addDblood(bloodDonate);
		return "home";
	}
	
	@RequestMapping(value = "/blood_donate_list.htm", method = RequestMethod.GET)
	public String allDonateList(ModelMap map, HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<BloodDonate> li = bloodDonateService.selectDall(userId);
		map.put("doList", li);
		return "blood_donate_list";
	}
	
	@RequestMapping(value = "/add_new_donor_form.htm",method = RequestMethod.GET)
	public String addNewDonateForm(ModelMap map) {
		map.put("bloodDonate", new BloodDonate());
		return "add_donor_form";
	}
	
	@RequestMapping(value = "/donor_add.htm", method = RequestMethod.POST)
	public String addNewDonateAdd(BloodDonate bloodDonate,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		bloodDonate.setUserId(userId);
		bloodDonateService.addDblood(bloodDonate);
		return "admhome";
	}
	
	@RequestMapping(value = "/donate_delete.htm",method = RequestMethod.GET)
	public String donateDelete(@RequestParam int donateId, ModelMap map, HttpSession session) {
		bloodDonateService.removeDonate(donateId);
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<BloodDonate> li = bloodDonateService.selectDall(userId);
		map.put("doList",li);
		return "blood_donate_list";
	}
	
	@RequestMapping(value = "/donate_update_form.htm", method = RequestMethod.GET)
	public String donateUpdateForm(@RequestParam int donateId, ModelMap map) {
		BloodDonate bdd = bloodDonateService.findDonate(donateId);
		map.put("doList", bdd);
		return "donate_update_form";
	}
	
	@RequestMapping(value = "/donate_update.htm", method = RequestMethod.POST)
	public String donateUpdate(BloodDonate bloodDonate,ModelMap map, HttpSession session) {
	
		int userId = ((User)session.getAttribute("user")).getUserId();
		bloodDonate.setUserId(userId);
		bloodDonateService.modifyDonate(bloodDonate);
		List<BloodDonate> li = bloodDonateService.selectDall(userId);
		map.put("doList", li);
		
		return "blood_donate_list";
	}
}
