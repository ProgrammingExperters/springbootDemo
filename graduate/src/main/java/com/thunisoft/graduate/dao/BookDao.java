package com.thunisoft.graduate.dao;

import com.thunisoft.graduate.common.model.Book;

import java.util.List;

public interface BookDao {
     Book getBooks();
     int addBooks(List<Book> books);
     int updateBook(Book book);
     int deleteBooks(Book book);
}
