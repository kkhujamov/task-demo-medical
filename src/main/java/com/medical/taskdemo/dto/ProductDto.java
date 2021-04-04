package com.medical.taskdemo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {

    private String id;
    private String name;
    private List<ProductDto> children;

    public ProductDto(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
