package com.java.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.java.springboot.details.Details;
import com.java.springboot.service.DetailsService;

@RestController
public class DetailsController {
  @Autowired
  private DetailsService detailsservice;
  @RequestMapping("/details")
  public List<Details> getAllDetails()
  {
	  return detailsservice.getAllDetails();
  }
  @RequestMapping(method=RequestMethod.POST,value="/details")
  public void createDetails(@RequestBody Details details)
  {
	  detailsservice.createDetails(details);
  }
  @RequestMapping(method=RequestMethod.PUT,value="/details/{songname}")
  public void updateDetails(@PathVariable String songname,@RequestBody Details details)
  {
	  detailsservice.updateDetails(songname,details);
  }
  @RequestMapping(method=RequestMethod.DELETE,value="/details/{songname}")
  public void deleteDetails(@PathVariable String songname)
  {
	  detailsservice.deleteDetails(songname);
  }
  
}
