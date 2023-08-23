package com.ebookstore.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ebookstore.main.model.Book;
import com.ebookstore.main.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService ser;
	
	//Read
	@GetMapping("getBook")
	public List<Book> show(){
		return ser.read();
	}
	
	//Read by Id
	@GetMapping("getBook/{id}")
	public Optional<Book> showId(@PathVariable int id){
		return ser.readid(id);
	}
	
	//Create
	@PostMapping("addBook")
	public String add(@RequestBody Book bk) {
		return ser.create(bk);
	}
	
	//Update
	@PutMapping("updateBook")
	public String update(@RequestBody Book bk) {
		return ser.update(bk);
	}
	
	//Update by Id
	@PutMapping("updateBookId")
	public String updateId(@RequestParam int id, @RequestBody Book bk) {
		return ser.updateid(id, bk);
	}
	
	//Delete
	@DeleteMapping("deleteBook")
	public String delete(Book bk) {
		return ser.delete(bk);
	}
	
	//Delete by Id
	@DeleteMapping("deleteBookId/{id}")
	public String deleteId(@PathVariable int id) {
		return ser.deleteid(id);
	}
}
