package br.com.drop.model.dto;


import br.com.drop.model.entities.Items;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Integer user;
    private BigDecimal total_value;
    private List<ItemDTO> items;

}