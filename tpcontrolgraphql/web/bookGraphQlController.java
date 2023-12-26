package com.example.tpcontrolgraphql.web;

import com.example.tpcontrolgraphql.service.bookManager;
import com.example.tpcontrolgraphql.service.dtos.bookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class bookGraphQlController {

    @Autowired
    private bookManager bookManager;

    @QueryMapping
    public List<bookDTO> getBookByTitle(@Argument String title) {
        return bookManager.getBookByTitle(title);
    }

    @QueryMapping
    public List<bookDTO> getBookByPublisherAndPrice(@Argument String publisher, @Argument double price) {
        return bookManager.getBookByPublisherAndPrice(publisher, price);
    }

    @MutationMapping
    public bookDTO saveBook(@Argument bookDTO bookDTO) {
        return bookManager.saveBook(bookDTO);
    }

    @MutationMapping
    public bookDTO deleteBook(@Argument Long id) {
        return bookManager.deleteBook(id);
    }
}
