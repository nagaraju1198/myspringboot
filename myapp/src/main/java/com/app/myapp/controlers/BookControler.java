package com.app.myapp.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.myapp.repositories.BookRepository;

@Controller
public class BookControler {
	
	private final BookRepository bookRepository;

	
	public BookControler(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@RequestMapping("/books")
	public String getBooks(Model model){	
		model.addAttribute("books",bookRepository.findAll());
		return "books/list";
	}

}
