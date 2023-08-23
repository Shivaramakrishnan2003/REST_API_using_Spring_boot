package com.ebookstore.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebookstore.main.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
