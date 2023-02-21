package com.tech;

import com.tech.model.Book;
import com.tech.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class SpringMongodbApplication {
	@Autowired
	private BookRepository repository;

	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book){
		return repository.save(book);
	}

	@GetMapping
	public List<Book> getBooks(){
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}

}
