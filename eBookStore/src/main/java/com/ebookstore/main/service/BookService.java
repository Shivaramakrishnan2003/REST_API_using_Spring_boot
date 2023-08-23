package com.ebookstore.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ebookstore.main.model.Book;
import com.ebookstore.main.repository.BookRepo;

@org.springframework.stereotype.Service
public class BookService {
	@Autowired
	BookRepo b;
	
	public List<Book> read(){
		return b.findAll();
	}
	
	public Optional<Book> readid(int id){			
		return b.findById(id);
	}
	
	public String create(Book bk) {
		if(!b.existsById(bk.getBookId())){
			b.save(bk);
			return "Record inserted successfully";
		}
		else
			return "A record is already found with book id "+bk.getBookId()+". Please enter record with a different book id.";
	}
	
	public String update(Book bk) {
		if(b.existsById(bk.getBookId())){
			b.saveAndFlush(bk);
			return "Record updated successfully";
		}
		else
			return "Record with book id "+bk.getBookId()+" is not found. Please check the book id carefully!";
	}
	
	public String updateid(int id, Book bk) {
		if(b.existsById(id)){
			b.saveAndFlush(bk);
			return "Record updated by id successfully";
		}
		else
			return "Record with book id "+id+" is not found. Please re-check book id!";
	}
	
	public String delete(Book bk) {
		if(!b.existsById(bk.getBookId())) {
			b.delete(bk);
			return "Record deleted successfully";
		}
		else
			return "Record not found";
	}
	
	public String deleteid(int id) {
		if(b.existsById(id)) {
			b.deleteById(id);
			return "Record deleted by id successfully";
		}
		else
			return "Record not found";
	}
}
