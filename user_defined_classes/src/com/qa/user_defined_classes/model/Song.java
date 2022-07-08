package com.qa.user_defined_classes.model;

import java.time.LocalDate;

public class Song {

	// runtime
	// genre
	// title
	// artist
	// lyrics
	// releaseDate
	
	private int seconds;
	private String genre;
	private String title;
	private String artist;
	private String lyrics;
	private LocalDate releaseDate;
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public int getSeconds() {
		return seconds;
	}
}
