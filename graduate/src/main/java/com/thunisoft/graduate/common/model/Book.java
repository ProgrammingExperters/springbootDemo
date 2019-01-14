package com.thunisoft.graduate.common.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {


    private Integer pages;
    private String name;
    private Integer books;
    public static Integer persons;

}
