package com.java.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import com.java.springboot.bean.StudentDetails;

public interface StudentRepository extends CrudRepository<StudentDetails,String>
{
	
}