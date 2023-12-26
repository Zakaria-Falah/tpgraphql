package com.example.tpcontrolgraphql.service.mappers;

import com.example.tpcontrolgraphql.dao.entities.book;
import com.example.tpcontrolgraphql.service.dtos.bookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
  private ModelMapper modelMapper = new ModelMapper();

  public book fromBookDtoToBook(bookDTO bookDTO){
      return this.modelMapper.map(bookDTO,book.class);
  }

  public bookDTO fromBookToBookDto(book book ){
      return this.modelMapper.map(book,bookDTO.class);
  }

}
