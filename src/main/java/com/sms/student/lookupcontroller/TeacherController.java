package com.sms.student.lookupcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api/teacher")
public class TeacherController {

	@GetMapping("/teacher-form")
	public String viewTeacher(Model model) {
		return "teacher";
	}

}
