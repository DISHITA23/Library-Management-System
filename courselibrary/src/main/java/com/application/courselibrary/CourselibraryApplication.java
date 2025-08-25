package com.application.courselibrary;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.entity.Book;
import com.application.courselibrary.entity.Category;
import com.application.courselibrary.entity.Publisher;
import com.application.courselibrary.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourselibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourselibraryApplication.class, args);
	}
		@Bean
		public CommandLineRunner initialCreate(BookService bookService){
	  		return (args)->{
				  //  Dummy inputs/data
				
				Book book1=new Book("9788193245279", "DSA Made Easy", "Practical guide for DSA with solved problems.");
				Author author1=new Author("Narasimha Karumanchi", "Test description");
				Category category1=new Category("Data Structures");
				Publisher publisher1=new Publisher("CareerMonk Publications");
				book1.addAuthor(author1);
				book1.addCategory(category1);
				book1.addPublisher(publisher1);
				bookService.createBook(book1);

				Book book2=new Book("9788176569704", "Core Java for Beginners", "Easy guide to Java basics with examples.");
				Author author2=new Author("Rashmi Kanta Das", "Test description");
				Category category2=new Category("Java Programming Books");
				Publisher publisher2=new Publisher("Vikas Publishing House");
				book2.addAuthor(author2);
				book2.addCategory(category2);
				book2.addPublisher(publisher2);
				bookService.createBook(book2);

				Book book3=new Book("9789386235657", "Programming and Problem Solving with Python", "My Third Book");
				Author author3=new Author("Ashok Namdev Kamthane, Amit Ashok Kamthane", "Step-by-step Python with examples and exercises.");
				Category category3=new Category("Python Programming Books");
				Publisher publisher3=new Publisher("McGraw Hill India");
				book3.addAuthor(author3);
				book3.addCategory(category3);
				book3.addPublisher(publisher3);
				bookService.createBook(book3);
			};
		}
	}


