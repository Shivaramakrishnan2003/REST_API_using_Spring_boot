package com.ebookstore.main.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="eBookStore")
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private float price;
	private int quantity;
	private String authorName;
	@Column(length=1024)
	private String description;
	private String publisher;
	private String language;
	private String genre;
	private LocalDateTime createdOn = LocalDateTime.now();
	
	//One to one
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "fk")
//	private Customer custDetails;
//	public Customer getCustDetails() {
//		return custDetails;
//	}
//	public void setCustDetails(Customer custDetails) {
//		this.custDetails = custDetails;
//	}
	
	//One to many
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk")
	private List<Customer> custDetails;
	public List<Customer> getCustDetails() {
		return custDetails;
	}
	public void setCustDetails(List<Customer> custDetails) {
		this.custDetails = custDetails;
	}
	//Field Constructor
	public Book(int bookId, String bookName, float price, int quantity, String authorName, String description,
			String publisher, String language, String genre) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.quantity = quantity;
		this.authorName = authorName;
		this.description = description;
		this.publisher = publisher;
		this.language = language;
		this.genre = genre;
	}
	//Getters and Setters
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	//Default Constructor
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}
