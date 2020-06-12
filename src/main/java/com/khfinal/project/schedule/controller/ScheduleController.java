package com.khfinal.project.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScheduleController {
	
	@RequestMapping("/schedule/schedule.do")
	public ModelAndView schedule() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("schedule/schedule");
		return mav;
	}
	
	@RequestMapping("/schedule/add.do")
	public ModelAndView scheduleAdd() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("schedule/schedule_add");
		return mav;
	}
	
}
