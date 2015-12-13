package com.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.jenkins.command.JenkinsCommand;
import com.jenkins.service.JenkinsService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("jenkinsController")
public class JenkinsController {
	
	@Autowired
	@Qualifier("jenkinsService")
	private JenkinsService jenkinsService;
	
	@RequestMapping(value="jenkinsHomePage.do")
	public ModelAndView testMethod(@ModelAttribute("jenkinsCommand") JenkinsCommand jenkinsCommand)
	{
		ModelAndView mav = new ModelAndView();
		String msg = getJenkinsService().testMethod();
		System.out.println("Request flow:"+ msg);
		mav.setViewName("jenkinsHomePage");
		return mav;
	}

	public JenkinsService getJenkinsService() {
		return jenkinsService;
	}

	public void setJenkinsService(JenkinsService jenkinsService) {
		this.jenkinsService = jenkinsService;
	}

	

}
