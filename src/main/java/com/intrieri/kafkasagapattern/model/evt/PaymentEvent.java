package com.intrieri.kafkasagapattern.model.evt;

import com.intrieri.kafkasagapattern.model.enums.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEvent {

    private Integer orderId;
    private PaymentStatus status;

    public PaymentEvent(Integer orderId) {
        this.orderId = orderId;
    }
}
