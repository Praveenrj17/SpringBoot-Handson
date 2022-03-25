package com.java.springboot.details;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Details")
public class Details {
	@Id
	private String songname;
	private String numberofviews;
	private String releaseyear;
	
	public Details() {
		
	}
	
	public Details(String songname, String numberofviews, String releaseyear) {
		super();
		this.songname = songname;
		this.numberofviews = numberofviews;
		this.setReleaseyear(releaseyear);
	}

	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getNumberofviews() {
		return numberofviews;
	}
	public void setNumberofviews(String numberofviews) {
		this.numberofviews = numberofviews;
	}

	public String getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(String releaseyear) {
		this.releaseyear = releaseyear;
	}
}
