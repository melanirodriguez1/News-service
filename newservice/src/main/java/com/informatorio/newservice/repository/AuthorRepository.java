package com.informatorio.newservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informatorio.newservice.domain.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
    
}
