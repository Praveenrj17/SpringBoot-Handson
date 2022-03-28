package com.java.springboot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.springboot.bean.StudentDetails;
import com.java.springboot.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository sturepo;
	
	public List<StudentDetails> getAllDetails()
	{
		List<StudentDetails> details = new ArrayList<>();
		sturepo.findAll().forEach(details::add);
		return details;
	}
	public void createStudentDetails(StudentDetails details)
	{
		sturepo.save(details);
	}
	public void updateStudentDetails(String name,StudentDetails details)
	{
		sturepo.save(details);
	}
	public void deleteStudentDetails(String name)
	{
		sturepo.deleteById(name);
	}

}
