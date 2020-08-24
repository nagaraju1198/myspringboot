package com.app.myapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.myapp.domain.Author;
import com.app.myapp.domain.Book;
import com.app.myapp.domain.Publisher;
import com.app.myapp.repositories.AuthorRepository;
import com.app.myapp.repositories.BookRepository;
import com.app.myapp.repositories.PubliserRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepsitory;
	private final PubliserRepository publishRep;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepsitory,
			PubliserRepository publishRep) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepsitory = bookRepsitory;
		this.publishRep = publishRep;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("started in boot strap");
		// TODO Auto-generated method stub
		Publisher publiser = new Publisher();
		publiser.setName("Falcon Pub ");
		publiser.setAddressLine1("addredd line 1");
		publiser.setCity("guntur");
		publiser.setZip("5282332");

		publishRep.save(publiser);
        System.out.println("publer : "+publiser);
		Author raju = new Author("raju", "m");
		Book b1 = new Book("tile", "123456");

		raju.getBook().add(b1);
		b1.getAuthors().add(raju);

		authorRepository.save(raju);
		bookRepsitory.save(b1);

		Author naga = new Author("naga", "raju");
		Book b2 = new Book("tile", "123456");

		naga.getBook().add(b2);
		b2.getAuthors().add(naga);

		authorRepository.save(naga);
		bookRepsitory.save(b2);

		System.out.println("number of books" + bookRepsitory.count());

	}

}
