package com.java.springboot.repository;
import org.springframework.data.repository.CrudRepository;
import com.java.springboot.details.Details;

	public interface DetailsRepository extends CrudRepository<Details,String> 
	{		
		
	}
