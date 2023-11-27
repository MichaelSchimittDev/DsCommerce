package com.devstarrk.dscommerce.dto;

import com.devstarrk.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductDTO {
    private Long id;

    @NotBlank(message = "Campo obrigatario")
    @Size(min = 3, max = 80, message = "Precisa ter entre 3 a 80 caracteres")
    private String name;

    @NotBlank(message = "Campo obrigatorio")
    @Size(min = 10, message = "Precisa ter no minimo 10 caracteres")
    private String description;

    @Positive(message = "O preco deve ser positivo")
    private Double price;

    private String imgUrl;

    public ProductDTO(Product entity){
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }
}
