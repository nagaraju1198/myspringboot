package com.app.myapp.controlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.myapp.repositories.AuthorRepository;

@Controller
public class AuthorControler {
	private AuthorRepository authRepo;
	

	public AuthorControler(AuthorRepository authRepo) {
		super();
		this.authRepo = authRepo;
	}



	@RequestMapping(value ="/authors" , method = RequestMethod.GET )
	public String getAuthors(HttpServletRequest requ, Model model)
	{
		model.addAttribute("authors",authRepo.findAll());
		return "authors/list";
	}
}
