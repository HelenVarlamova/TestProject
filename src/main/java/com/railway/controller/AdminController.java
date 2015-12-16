package com.railway.controller;

import com.railway.model.StationBinding;
import com.railway.model.Train;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
	@RequestMapping(value = "/admin/", method = RequestMethod.GET)
	public String admin(Model model,  HttpServletRequest request) {
		//model.addAttribute("train", new Train());
		//model.addAttribute("station", new Station());
		model.addAttribute("stationBinding", new StationBinding());
		model.addAttribute("urlcont", request.getRequestURL());
		return "admin";
	}

	
}
