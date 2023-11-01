package com.savina.demoproductservice.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Category extends Serializers.Base {
    private String name;
    private  String description;
    private List<Product> products;

}
