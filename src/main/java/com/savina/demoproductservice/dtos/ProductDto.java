package com.savina.demoproductservice.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {
    public String title;
    public String description;
    public Double price;
    public String image;
    public String category;

}
