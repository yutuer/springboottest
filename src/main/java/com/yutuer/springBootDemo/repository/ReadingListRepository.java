package com.yutuer.springBootDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yutuer.springBootDemo.bean.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long>{
	
	List<Book> findByReader(String reader);
}
