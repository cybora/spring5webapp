package com.bora.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.bora.model.Author;
import com.bora.model.Book;
import com.bora.repositories.AuthorRepository;
import com.bora.repositories.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}
	
	private void initData() {
		Author a1 = new Author("Bora", "Köksel");
		Book b1 = new Book("Domain Driven Design", "1231412321", "Bora Publishing");
		a1.getBooks().add(b1);
		b1.getAuthors().add(a1);
		
		authorRepository.save(a1);
		bookRepository.save(b1);
		
		Author a2 = new Author("Selale", "Köksel");
		Book b2 = new Book("Java Development", "30209402940290", "Selale Publishing");
		a2.getBooks().add(b2);
		
		authorRepository.save(a2);
		bookRepository.save(b2);
	}
}
