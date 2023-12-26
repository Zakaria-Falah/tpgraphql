package com.example.tpcontrolgraphql.service;

import com.example.tpcontrolgraphql.dao.repository.bookRepository;
import com.example.tpcontrolgraphql.service.dtos.bookDTO;
import com.example.tpcontrolgraphql.service.mappers.bookMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class BookManagerAction implements bookManager{

    @Autowired
    private bookRepository bookRepository;
    @Autowired
    private bookMapper bookMapper;
    @Override
    public List<bookDTO> getBookByTitle(String title) {
        return bookRepository.findBookByTitre(title).stream().
                map(bookMapper::fromBookToBookDto).
                collect(Collectors.toList());
    }

    @Override
    public List<bookDTO> getBookByPublisherAmdPrice(String publisher, double price) {
        return null;
    }

    @Override
    public bookDTO saveBook(bookDTO bookDTO) {
        return null;
    }

    @Override
    public bookDTO deleteBook(Long id) {
        return null;
    }
}

