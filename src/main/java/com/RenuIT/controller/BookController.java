package com.RenuIT.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.RenuIT.model.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public ModelAndView books() {
		Book b = new Book();

		b.setBookId(111);
		b.setBookName("JAVA_1.8");
		b.setBookPrize(975.00);

		ModelAndView mav = new ModelAndView();
		mav.addObject("Books", b);
		mav.setViewName("book");
		return mav;
	}
	@GetMapping("/ListOfBooks")
	public ModelAndView Listbooks () {
		Book b1 = new Book();
		
		b1.setBookId(111);
		b1.setBookName("JAVA_1.8");
		b1.setBookPrize(975.00);
		
		Book b2 = new Book();
		
		b2.setBookId(111);
		b2.setBookName("JDBC");
		b2.setBookPrize(175.00);
		
		Book b3 = new Book();
		
		b3.setBookId(111);
		b3.setBookName("Hibernate");
		b3.setBookPrize(375.00);
		
		ArrayList bl = new ArrayList();
		bl.add(bl);
		bl.add(b2);
		bl.add(b3);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("ListOfBooks", bl);
		mav.setViewName("bookList");
		
		return mav;
	}

}
