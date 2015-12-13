package com.jenkins.dao;

import org.springframework.stereotype.Repository;

@Repository("jenkinsDAO")
public class JenkinsDAO {
	
	public String testMethod()
	{
		return "DAP class works";
	}

}
