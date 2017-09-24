package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.domain.FeedBack;
import com.bookstore.service.FeedBackService;

@Controller
public class FeedBackController {
	@Autowired
	private FeedBackService feedBackService;
	@RequestMapping(value="/feedback")
	//留言区
	public String feedback(Model model)
	{	
		List<FeedBack> list=feedBackService.SelectLeaveMessage();
		model.addAttribute("feedbacks", list);
		return "feedback";
	}		
	@RequestMapping(value="/addFeedBack")
	public String feedback(Model model,FeedBack feedback)
	{
		feedBackService.saveFeedBack(feedback);
		List<FeedBack> list=feedBackService.SelectLeaveMessage();
		model.addAttribute("feedbacks", list);
		return "contact";
	}
	
	
	
	
	
	
	
	
}
