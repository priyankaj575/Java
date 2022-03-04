package com.lms.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@Column(name="ISBN")
	private String ISBN;
	
	@Column(name="title")
	private String title;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="available")
	private int available;

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", publisher=" + publisher + ", available=" + available
				+ "]";
	}
	
	
}
