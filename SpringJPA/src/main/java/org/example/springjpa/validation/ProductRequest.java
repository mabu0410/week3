package org.example.springjpa.validation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ProductRequest {
    @NotBlank(message = "Tên không được để trống")
    private String name;

    @Positive(message = "Giá phải lớn hơn 0")
    private Double price;
}
