package com.example.tpcontrolgraphql.service;

import com.example.tpcontrolgraphql.service.dtos.bookDTO;

import java.util.List;

public interface bookManager {
    List<bookDTO> getBookByTitle(String title);
    List<bookDTO> getBookByPublisherAmdPrice(String publisher,double price);
    bookDTO saveBook(bookDTO bookDTO);
    bookDTO deleteBook(Long id);

    List<bookDTO> getBookByPublisherAndPrice(String publisher, double price);
}
