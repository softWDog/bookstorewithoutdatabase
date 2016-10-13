package com.dengguoxian.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dengguoxian.model.Book;
import com.dengguoxian.model.Category;
@Service
public class BookServiceImpl implements BookService {
	private List<Category> categories;
	private List<Book> books;
	
	public BookServiceImpl() {
		categories=new ArrayList<Category>();
		Category category1=new Category(1,"computing");
		Category category2=new Category(2,"Travel");
		Category category3=new Category(3,"Health");
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
		books =new ArrayList<Book>();
		books.add(new Book(1L, "12343636", "Servlet&Jsp:A Tutorial", category1, "budi deng"));
		books.add(new Book(2L, "215431643", "c#:A beginner's Tuttorial", category1, "JayDen"));
		
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categories;
	}

	public Category getCategory(int id) {
		// TODO Auto-generated method stub
		for(Category category:categories){
			if(id==category.getId()){
				return category;
			}
		}
		return null;
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	public Book save(Book book) {
		// TODO Auto-generated method stub
		book.setId(getNextId());
		books.add(book);
		return book;
	}

	public Book update(Book book) {
		// TODO Auto-generated method stub
		int bookCount=books.size();
		for(int i=0;i<bookCount;i++){
			Book savedBook=books.get(i);
			if(savedBook.getId()==book.getId()){
				books.set(i, book);
				return book;
			}
		}
		return book;
		
	}

	public Book get(long id) {
		// TODO Auto-generated method stub
		for(Book book:books){
			if(book.getId()==id){
				return book;
			}
		}
		return null;
		
	}

	public long getNextId() {
		// TODO Auto-generated method stub
		long id=0L;
		for(Book book:books){
			long bookId=book.getId();
			if(bookId>id){
				id=bookId;
			}
		}
		return id+1;
	}

}
