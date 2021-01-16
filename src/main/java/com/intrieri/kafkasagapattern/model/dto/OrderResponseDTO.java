package com.intrieri.kafkasagapattern.model.dto;

import com.intrieri.kafkasagapattern.model.enums.OrderStatus;

import lombok.Data;

@Data
public class OrderResponseDTO {

    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer price;
    private OrderStatus status;

}
