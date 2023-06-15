package com.sms.student.lookupcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/student")
public class StudentController {

	@GetMapping("/registration-form")
		public String viewStudent(Model model) {
			return "student";
		}

	
}
