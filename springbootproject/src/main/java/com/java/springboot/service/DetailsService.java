package com.java.springboot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.java.springboot.details.Details;
import com.java.springboot.repository.DetailsRepository;

@Service
public class DetailsService {
  @Autowired
  public DetailsRepository detailsRepo;
  
  public List<Details> getAllDetails()
  {
	  List<Details> detail = new ArrayList<>();
		detailsRepo.findAll().forEach(detail::add);
		return detail;
  }
	  public void createDetails(Details detail) {
			detailsRepo.save(detail);
  }
	  
		  public void updateDetails(String songname, Details detail) {
				detailsRepo.save(detail); 
	  }
		  public void deleteDetails(String songname) {
                 detailsRepo.deleteById(songname);		  
             }
}
