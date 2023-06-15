package com.sms.student.lookupcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DashBoardController {

	@GetMapping("/dashboard")
	public String getDashboard(Model model) {
		return "dashboard";
	}

}