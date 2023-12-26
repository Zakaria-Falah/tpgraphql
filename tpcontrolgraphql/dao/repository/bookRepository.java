package com.example.tpcontrolgraphql.dao.repository;

import com.example.tpcontrolgraphql.dao.entities.book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface bookRepository extends JpaRepository<book, Long> {
    List<book> findBookByTitre(String title);
    List<book> findBooksByPublisherAndPrice(String publisher,double price);
}
