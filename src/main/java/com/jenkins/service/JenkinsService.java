package com.jenkins.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jenkins.dao.JenkinsDAO;

@Service("jenkinsService")
public class JenkinsService {
	
	@Autowired
	@Qualifier("jenkinsDAO")
	private JenkinsDAO jenkinsDAO;
		
	public String testMethod()
	{
		String msg = getJenkinsDAO().testMethod();
		return msg;
	}

	public JenkinsDAO getJenkinsDAO() {
		return jenkinsDAO;
	}

	public void setJenkinsDAO(JenkinsDAO jenkinsDAO) {
		this.jenkinsDAO = jenkinsDAO;
	}

	
}
