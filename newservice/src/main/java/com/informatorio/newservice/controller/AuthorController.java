package com.informatorio.newservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.newservice.domain.Author;
import com.informatorio.newservice.repository.AuthorRepository;

@RestController
public class AuthorController {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }


}
