package com.java.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.java.springboot.bean.StudentDetails;
import com.java.springboot.service.StudentService;

@RestController
public class StudentController {
	@Autowired	
	private StudentService stuservice;
	@RequestMapping("/values")
	public List<StudentDetails> getAllDetails()
	{
		return stuservice.getAllDetails();
	}
	@RequestMapping(method=RequestMethod.POST,value="/values")
	public void createStudentDetails(@RequestBody StudentDetails details)
	{
		stuservice.createStudentDetails(details);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/values/{name}")
	public void updateStudentDetails(@PathVariable String name,@RequestBody StudentDetails details)
	{
		stuservice.updateStudentDetails(name,details);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/values/{name}")
	public void deleteStudentDetails(@PathVariable String name)
	{
		stuservice.deleteStudentDetails(name);
	}
}
